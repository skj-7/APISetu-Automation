package POJOs;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

public class DistrictRoot{
    @JsonProperty("districts")
    public ArrayList<District> getDistricts() {
        return this.districts; }
    public void setDistricts(ArrayList<District> districts) {
        this.districts = districts; }
    ArrayList<District> districts;
    @JsonProperty("ttl")
    public int getTtl() {
        return this.ttl; }
    public void setTtl(int ttl) {
        this.ttl = ttl; }
    int ttl;
}


