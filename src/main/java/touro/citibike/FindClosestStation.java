package touro.citibike;

import java.util.List;

public class FindClosestStation {

    private double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        return Math.sqrt(Math.pow(lat2 - lat1, 2) + Math.pow(lon2 - lon1, 2));
    }

    public StationInfo findClosestStation(double currentLat, double currentLon, List<StationInfo> stations) {
        StationInfo closestStation = null;
        double minDistance = Double.MAX_VALUE;

        for (StationInfo station : stations) {
            double distance = calculateDistance(currentLat, currentLon, station.getLatitude(), station.getLongitude());

            if (distance < minDistance) {
                minDistance = distance;
                closestStation = station;
            }
        }

        return closestStation;
    }
}
