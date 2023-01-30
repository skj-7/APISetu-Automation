package POJOs;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Session {
    @JsonProperty("center_id")
    public int getCenter_id() {
        return this.center_id;
    }

    public void setCenter_id(int center_id) {
        this.center_id = center_id;
    }

    int center_id;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    @JsonProperty("address")
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    String address;

    @JsonProperty("state_name")
    public String getState_name() {
        return this.state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    String state_name;

    @JsonProperty("district_name")
    public String getDistrict_name() {
        return this.district_name;
    }

    public void setDistrict_name(String district_name) {
        this.district_name = district_name;
    }

    String district_name;

    @JsonProperty("block_name")
    public String getBlock_name() {
        return this.block_name;
    }

    public void setBlock_name(String block_name) {
        this.block_name = block_name;
    }

    String block_name;

    @JsonProperty("pincode")
    public int getPincode() {
        return this.pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    int pincode;

    @JsonProperty("from")
    public String getFrom() {
        return this.from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    String from;

    @JsonProperty("to")
    public String getMyto() {
        return this.myto;
    }

    public void setMyto(String myto) {
        this.myto = myto;
    }

    String myto;

    @JsonProperty("lat")
    public int getLat() {
        return this.lat;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    int lat;

    @JsonProperty("long")
    public int getMylong() {
        return this.mylong;
    }

    public void setMylong(int mylong) {
        this.mylong = mylong;
    }

    int mylong;

    @JsonProperty("fee_type")
    public String getFee_type() {
        return this.fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    String fee_type;

    @JsonProperty("session_id")
    public String getSession_id() {
        return this.session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    String session_id;

    @JsonProperty("date")
    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    String date;

    @JsonProperty("available_capacity")
    public int getAvailable_capacity() {
        return this.available_capacity;
    }

    public void setAvailable_capacity(int available_capacity) {
        this.available_capacity = available_capacity;
    }

    int available_capacity;

    @JsonProperty("available_capacity_dose1")
    public int getAvailable_capacity_dose1() {
        return this.available_capacity_dose1;
    }

    public void setAvailable_capacity_dose1(int available_capacity_dose1) {
        this.available_capacity_dose1 = available_capacity_dose1;
    }

    int available_capacity_dose1;

    @JsonProperty("available_capacity_dose2")
    public int getAvailable_capacity_dose2() {
        return this.available_capacity_dose2;
    }

    public void setAvailable_capacity_dose2(int available_capacity_dose2) {
        this.available_capacity_dose2 = available_capacity_dose2;
    }

    int available_capacity_dose2;

    @JsonProperty("fee")
    public String getFee() {
        return this.fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    String fee;

    @JsonProperty("allow_all_age")
    public boolean getAllow_all_age() {
        return this.allow_all_age;
    }

    public void setAllow_all_age(boolean allow_all_age) {
        this.allow_all_age = allow_all_age;
    }

    boolean allow_all_age;

    @JsonProperty("min_age_limit")
    public int getMin_age_limit() {
        return this.min_age_limit;
    }

    public void setMin_age_limit(int min_age_limit) {
        this.min_age_limit = min_age_limit;
    }

    int min_age_limit;

    @JsonProperty("vaccine")
    public String getVaccine() {
        return this.vaccine;
    }

    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    String vaccine;

    @JsonProperty("slots")
    public ArrayList<Slot> getSlots() {
        return this.slots;
    }

    public void setSlots(ArrayList<Slot> slots) {
        this.slots = slots;
    }

    ArrayList<Slot> slots;

    @JsonProperty("max_age_limit")
    public int getMax_age_limit() {
        return this.max_age_limit;
    }

    public void setMax_age_limit(int max_age_limit) {
        this.max_age_limit = max_age_limit;
    }

    int max_age_limit;
}

class Slot{
    @JsonProperty("time")
    public String getTime() {
        return this.time; }
    public void setTime(String time) {
        this.time = time; }
    String time;
    @JsonProperty("seats")
    public int getSeats() {
        return this.seats; }
    public void setSeats(int seats) {
        this.seats = seats; }
    int seats;
}
