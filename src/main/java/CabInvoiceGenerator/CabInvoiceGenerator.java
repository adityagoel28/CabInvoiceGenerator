package CabInvoiceGenerator;

import java.util.List;

public class CabInvoiceGenerator {

    private static final double COST_PER_KILOMETER = 10.0;
    private static final double COST_PER_MINUTE = 1.0;
    private static final double MINIMUM_FARE = 5.0;

    public double calculateFare(double distanceInKilometers, double timeInMinutes) {
        double totalFare = (distanceInKilometers * COST_PER_KILOMETER) + (timeInMinutes * COST_PER_MINUTE);
        return Math.max(totalFare, MINIMUM_FARE);
    }

    public double calculateTotalFareForMultipleRides(List<Ride> rides) {
        return rides.stream()
                .mapToDouble(ride -> calculateFare(ride.getDistance(), ride.getTime()))
                .sum();
    }
}
