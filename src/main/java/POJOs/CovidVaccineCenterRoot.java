package POJOs;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class CovidVaccineCenterRoot{
    @JsonProperty("sessions")
    public ArrayList<Session> getSessions() {
        return this.sessions; }
    public void setSessions(ArrayList<Session> sessions) {
        this.sessions = sessions; }
    ArrayList<Session> sessions;
}


