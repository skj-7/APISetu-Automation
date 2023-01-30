package POJOs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class State {
    @JsonProperty("state_id")
    public int getState_id() {
        return this.state_id;
    }

    public void setState_id(int state_id) {
        this.state_id = state_id;
    }

    int state_id;

    @JsonProperty("state_name")
    public String getState_name() {
        return this.state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    String state_name;
}
