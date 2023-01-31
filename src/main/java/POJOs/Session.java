package pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Data
@Getter
@Setter
public class Session {

    private String date;
    private Integer pincode;
    private String address;
    private Integer min_age_limit;
    private Integer max_age_limit;
    private String fee;
    private String session_id;
    private String fee_type;
    private Integer available_capacity;
    @JsonProperty("long")
    private Integer my_long;
    private String district_name;
    private String block_name;
    private String vaccine;
    private ArrayList<Slots> slots;
    private Integer center_id;
    private String state_name;
    private String name;
    private String from;
    private String to;
    private Boolean allow_all_age;
    private Integer available_capacity_dose2;
    private Integer lat;
    private Integer available_capacity_dose1;
}