import POJOs.District;
import POJOs.DistrictRoot;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.*;
import io.restassured.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Objects;
public class DistrictIDTest {

    int state_id =16;
    @BeforeClass
    public void checkResponse()
    {
        RestAssured.baseURI="https://cdn-api.co-vin.in/api/v2/admin/location/districts/";
        RequestSpecification r =RestAssured.given();
        Response res = r.get(String.valueOf(state_id));
        Assert.assertEquals(res.getStatusCode(),200);
    }
    @Test
    public void validateDistrictId()
    {
        RequestSpecification r =RestAssured.given();
        Response res = r.get(String.valueOf(state_id));
        DistrictRoot districtRoot = res.getBody().as(DistrictRoot.class);

        ArrayList<District> districts = districtRoot.getDistricts();

        int actualDistrict_id = 265;
        int responseDistrict_id = 0;

        String districtName = "Bangalore Urban";

        for(District district:districts){
            if(Objects.equals(district.getDistrict_name(),districtName )){
                responseDistrict_id = district.getDistrict_id();
            }
        }
        Assert.assertEquals(actualDistrict_id, responseDistrict_id);
    }
}
