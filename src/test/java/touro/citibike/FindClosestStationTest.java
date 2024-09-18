package touro.citibike;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FindClosestStationTest {

    @Test
    void findClosestStation() {
        // Given
        FindClosestStation finder = new FindClosestStation();
        List<StationInfo> stations = List.of(
                new StationInfo(10.0000, 20.0000),
                new StationInfo(15.0000, 25.0000),
                new StationInfo(30.0000, 40.0000)
        );

        double currentLat = 11.0000;
        double currentLon = 21.0000;

        // When
        StationInfo closestStation = finder.findClosestStation(currentLat, currentLon, stations);

        // Then
        assertNotNull(closestStation);
        assertEquals(10.0000, closestStation.getLatitude());
        assertEquals(20.0000, closestStation.getLongitude());
    }
}
