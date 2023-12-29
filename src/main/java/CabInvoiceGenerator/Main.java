package CabInvoiceGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cab Invoice Generator program!");

        CabInvoiceGenerator generator = new CabInvoiceGenerator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter distance in kilometers:");
        double distance = sc.nextDouble();

        System.out.println("Enter time in minutes:");
        double time = sc.nextDouble();

        // Fare calculation
        double fare = generator.calculateFare(distance, time);
        System.out.println("Total Fare: Rs. " + fare);
    }
}
