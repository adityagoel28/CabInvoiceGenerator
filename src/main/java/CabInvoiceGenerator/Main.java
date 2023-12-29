package CabInvoiceGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cab Invoice Generator program!");

        Scanner sc = new Scanner(System.in);
        CabInvoiceGenerator generator = new CabInvoiceGenerator();
        List<Ride> rides = new ArrayList<>();

        System.out.println("Enter the number of rides:");
        int numRides = sc.nextInt();

        for(int i = 0; i < numRides; i++){
            System.out.println("Enter distance for ride " + (i + 1) + " in kilometers:");
            double distance = sc.nextDouble();

            System.out.println("Enter time for ride " + (i + 1) + " in minutes:");
            double time = sc.nextDouble();

            rides.add(new Ride(distance, time));
        }

        double totalFare = generator.calculateTotalFareForMultipleRides(rides);
        System.out.println("Total Fare for all rides: Rs. " + totalFare);
    }
}
