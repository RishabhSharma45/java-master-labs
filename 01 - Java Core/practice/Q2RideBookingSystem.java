package prahar.oops.practice;

// Parent Class (Abstraction)
abstract class Vehicle {
    protected double ratePerKm;

    abstract double fare(double km);
}

class Bike extends Vehicle {
    public Bike() { this.ratePerKm = 50; }

    @Override
    double fare(double km) {
        return km * ratePerKm;
    }
}

class Auto extends Vehicle {
    public Auto() { this.ratePerKm = 100; }

    @Override
    double fare(double km) {
        return km * ratePerKm;
    }
}

class Car extends Vehicle {
    public Car() { this.ratePerKm = 150; }

    @Override
    double fare(double km) {
        return km * ratePerKm;
    }
}

// Composition
class Driver {
    private Vehicle vehicle;   // HAS-A vehicle
    private String name;

    public Driver(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public double calculatedFare(double km) {
        return vehicle.fare(km);   // POLYMORPHISM 🔥
    }
}

class RideBooking {  // Aggregation (uses Driver)
    private Driver driver;

    public RideBooking(Driver driver) {
        this.driver = driver;
    }

    public void book(double km) {
        System.out.println("Fare: " + driver.calculatedFare(km));
    }
}

public class Q2RideBookingSystem {
    public static void main(String[] args) {

        RideBooking booking1 = new RideBooking(
                new Driver("Ramesh", new Bike())
        );
        booking1.book(10);

        RideBooking booking2 = new RideBooking(
                new Driver("Suresh", new Car())
        );
        booking2.book(5);
    }
}
