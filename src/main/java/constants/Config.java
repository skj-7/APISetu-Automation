package constants;

public class Config {
    public final static String BASE_URL = "https://cdn-api.co-vin.in/api/v2";
    public final static String GET_ALL_STATES = "/admin/location/states";
    public final static String GET_ALL_DISTRICTS = "/admin/location/districts/{state_id}";
    public final static String GET_ALL_HOSPITALS = "/appointment/sessions/public/findByDistrict";
}
