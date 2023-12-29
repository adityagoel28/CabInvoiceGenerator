package CabInvoiceGenerator;

public class Ride {
    private final double distance; // in kilometers
    private final double time;     // in minutes

    public Ride(double distance, double time) {
        this.distance = distance;
        this.time = time;
    }

    public double getDistance() {
        return distance;
    }

    public double getTime() {
        return time;
    }
}
