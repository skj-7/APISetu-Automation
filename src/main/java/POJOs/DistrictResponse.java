package pojos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Data
@Getter
@Setter
public class DistrictResponse {
    private ArrayList<District> districts;
    private Integer ttl;
}