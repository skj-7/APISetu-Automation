import POJOs.CovidVaccineCenterRoot;
import POJOs.Session;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.jetbrains.annotations.NotNull;
import org.testng.*;
import io.restassured.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class PriceOfVaccineTest {

    public static @NotNull String getTodayDate(){
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date;
        date = simpleDateFormat.format(new Date());
        return date;
    }
    String district_id = "265";
    ArrayList<Session> sessions;
    @BeforeClass
    public void checkResponse()
    {
        RestAssured.baseURI="https://cdn-api.co-vin.in/api/v2/appointment/sessions/public/findByDistrict";
        RequestSpecification r =RestAssured.given().queryParam("district_id",district_id).queryParam("date",getTodayDate());
        Response res = r.get();
        Assert.assertEquals(res.getStatusCode(),200);
    }
    @Test(priority = 1)
    public void validatePriceOfVaccine(){

        RequestSpecification r =RestAssured.given().queryParam("district_id",district_id).queryParam("date",getTodayDate());
        Response res = r.get();
        CovidVaccineCenterRoot centerRoot = res.getBody().as(CovidVaccineCenterRoot.class);

        sessions = centerRoot.getSessions();

        float fee = 0.0F, threshold = 300.0F;

        String hospitalName = "Springleaf Healthcare";

        for(Session session: sessions){
            if(Objects.equals(session.getName(), hospitalName)){
                fee= Float.parseFloat(session.getFee());
            }
        }

        Assert.assertTrue(fee >= threshold);
    }

    @Test(priority = 2)
    public void validateHospitalWithFeeVaccine(){
        boolean feeVaccineAvailable = false;
        for(Session session: sessions){
            if(Objects.equals(session.getFee_type(), "Free")){
                feeVaccineAvailable = true;
                break;
            }
        }
        Assert.assertTrue(feeVaccineAvailable);
    }
}
