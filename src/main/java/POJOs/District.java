package POJOs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class District {
    @JsonProperty("district_id")
    public int getDistrict_id() {
        return this.district_id;
    }

    public void setDistrict_id(int district_id) {
        this.district_id = district_id;
    }

    int district_id;

    @JsonProperty("district_name")
    public String getDistrict_name() {
        return this.district_name;
    }

    public void setDistrict_name(String district_name) {
        this.district_name = district_name;
    }

    String district_name;
}
