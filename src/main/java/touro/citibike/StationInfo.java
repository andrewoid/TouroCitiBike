package touro.citibike;

public class StationInfo {

    String stationId;
    private double latitude;
    private double longitude;

    public StationInfo(double latitude, double longitude) {

        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }


}
