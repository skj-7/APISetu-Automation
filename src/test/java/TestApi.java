import helpers.ApiSetuHelper;
import helpers.DateCalculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pojos.*;

import java.util.ArrayList;
import java.util.Objects;

public class TestApi {
    private ApiSetuHelper apiSetuHelper;
    private StateResponse stateResponse;
    private String date;

    @BeforeClass
    public void init() {
        apiSetuHelper = new ApiSetuHelper();
        stateResponse = apiSetuHelper.getStateResponse();
        date = DateCalculator.getTodayDate();
    }

    //Validate all states have their ids
    @Test
    public void validateAllStateHaveID() {
        ArrayList<State> states = stateResponse.getStates();
        boolean allStateHaveID = true;      // Set it to false if any of the state doesn't have state_id.
        for (State state : states) {
            if (state.getState_id() == 0) {
                allStateHaveID = false;
                break;
            }
        }
        Assert.assertTrue(allStateHaveID, "All states have their IDs");
    }

    //Validates that the state ID of Karnataka is 16
    @Test
    public void validateStateId() {
        int actualStateId = 16;
        int responseStateId = 0;
        String stateName = "Karnataka";
        for (State state : stateResponse.getStates()) {
            if (Objects.equals(state.getState_name(), stateName)) {
                responseStateId = state.getState_id();
                break;
            }
        }
        Assert.assertEquals(actualStateId, responseStateId, "State ID of Karnataka is 16");
    }

    //Validates that the district ID of Bangalore Urban is 265
    @Test
    public void validateDistrictId() {
        ArrayList<District> districts = apiSetuHelper.getDistrictResponse(16).getDistricts();
        int actualDistrictId = 265;
        int responseDistrictId = 0;
        String districtName = "Bangalore Urban";
        for (District district : districts) {
            if (Objects.equals(district.getDistrict_name(), districtName)) {
                responseDistrictId = district.getDistrict_id();
                break;
            }
        }
        Assert.assertEquals(actualDistrictId, responseDistrictId, "District ID of Bangalore Urban is 265");
    }

    //Validates that Springleaf Healthcare's vaccine fees > Rs 300
    @Test
    public void validatePriceOfVaccine() {
        ArrayList<Session> sessions = apiSetuHelper.getCovidVaccineCenterResponse(265, date).getSessions();
        float fee = 0.0F, threshold = 300.0F;
        String hospitalName = "Springleaf Healthcare";
        System.out.println();
        for (Session session : sessions) {
            if (Objects.equals(session.getName(), hospitalName)) {
                fee = Float.parseFloat(session.getFee());
            }
        }
        Assert.assertTrue(fee >= threshold, "Springleaf Healthcare's vaccine fees > Rs 300");
    }

    //Validates that there exists at least 1 free vaccine center
    @Test
    public void validateHospitalWithFeeVaccine() {
        boolean feeVaccineAvailable = false;
        ArrayList<Session> sessions = apiSetuHelper.getCovidVaccineCenterResponse(265, date).getSessions();
        for (Session session : sessions) {
            if (Objects.equals(session.getFee_type(), "Free")) {
                feeVaccineAvailable = true;
                break;
            }
        }
        Assert.assertTrue(feeVaccineAvailable, "Free vaccine is available in at-least one hospital");
    }
}