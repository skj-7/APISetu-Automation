import POJOs.State;
import POJOs.StateRoot;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.*;
import io.restassured.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Objects;


public class StateIDTest {

    ArrayList<State> states;

    @BeforeClass
    public void checkResponse()
    {
        RestAssured.baseURI="https://cdn-api.co-vin.in/api/v2/admin/location/states";
        RequestSpecification r =RestAssured.given();
        Response res = r.get();
        Assert.assertEquals(res.getStatusCode(),200);
    }

    @Test(priority = 1)
    public void validateAllStateID(){
        RequestSpecification r =RestAssured.given();
        Response res = r.get();

        StateRoot stateRoot = res.getBody().as(StateRoot.class);

        states = stateRoot.getStates();

        boolean allStatesHaveIDs  = true; // Set it to false if any of the state doesn't have state_id.

        for(State state:states){
            if(state.getState_id()==0){
                allStatesHaveIDs = false;
                break;
            }
        }
        Assert.assertTrue(allStatesHaveIDs);
    }
    @Test(priority = 2)
    public void validateKarnatakaStateId()
    {
        int actualState_id = 16;
        int responseState_id = 0;

        String stateName = "Karnataka";

        for(State state:states){
            if(Objects.equals(state.getState_name(), stateName)){
                responseState_id = state.getState_id();
            }
        }
        Assert.assertEquals(actualState_id, responseState_id);
    }

}
