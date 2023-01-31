package helpers;

import constants.Config;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.CovidVaccineCenterResponse;
import pojos.DistrictResponse;
import pojos.StateResponse;

import static org.testng.Assert.assertEquals;

public class ApiSetuHelper {
    public ApiSetuHelper() {
        RestAssured.baseURI = Config.BASE_URL;
    }

    public StateResponse getStateResponse() {
        RequestSpecification r = RestAssured.given();
        Response res = r.get(Config.GET_ALL_STATES);
        StateResponse stateResponse = res.getBody().as(StateResponse.class);
        assertEquals(res.getStatusCode(), 200, "OK-States response received");
        return stateResponse;
    }

    public DistrictResponse getDistrictResponse(int stateID) {
        RequestSpecification r = RestAssured.given().pathParam("state_id", stateID);
        Response res = r.get(Config.GET_ALL_DISTRICTS);
        DistrictResponse districtResponse = res.getBody().as(DistrictResponse.class);
        assertEquals(res.getStatusCode(), 200, "OK-Districts response received");
        return districtResponse;
    }

    public CovidVaccineCenterResponse getCovidVaccineCenterResponse(int districtID, String date) {
        RequestSpecification r = RestAssured.given().queryParam("district_id", districtID).queryParam("date", date);
        Response res = r.get(Config.GET_ALL_HOSPITALS);
        CovidVaccineCenterResponse covidVaccineCenterResponse = res.getBody().as(CovidVaccineCenterResponse.class);
        assertEquals(res.getStatusCode(), 200, "OK-Hospitals response received");
        return covidVaccineCenterResponse;
    }
}
