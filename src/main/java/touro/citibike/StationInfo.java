package touro.citibike;

public class StationInfo {

    String stationId;
    private double lat;
    private double lon;

    public StationInfo(double latitude, double longitude) {

        this.lat = latitude;
        this.lon = longitude;
    }

    public double getLatitude() {
        return lat;
    }

    public double getLongitude() {
        return lon;
    }


}
