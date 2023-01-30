package POJOs;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class StateRoot{
    @JsonProperty("states")
    public ArrayList<State> getStates() {
        return this.states; }
    public void setStates(ArrayList<State> states) {
        this.states = states; }
    ArrayList<State> states;
    @JsonProperty("ttl")
    public int getTtl() {
        return this.ttl; }
    public void setTtl(int ttl) {
        this.ttl = ttl; }
    int ttl;
}
