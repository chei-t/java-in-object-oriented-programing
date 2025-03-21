// Base class Vehicle
abstract class Vehicle {
    protected String brand;
    protected int speed;

    // Constructor
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method to accelerate
    public void accelerate(int increase) {
        speed += increase;
        System.out.println(brand + " accelerated by " + increase + ". Current speed: " + speed);
    }

    // Method to brake
    public void brake(int decrease) {
        speed -= decrease;
        if (speed < 0) {
            speed = 0;
        }
        System.out.println(brand + " slowed down by " + decrease + ". Current speed: " + speed);
    }

    // Abstract method to display details
    public abstract void showDetails();
}

// Subclass Car
class Car extends Vehicle {
    private int fuelLevel; // Fuel level as a percentage

    // Constructor
    public Car(String brand, int speed, int fuelLevel) {
        super(brand, speed);
        this.fuelLevel = fuelLevel;
    }

    // Method to refuel
    public void refuel(int amount) {
        fuelLevel += amount;
        if (fuelLevel > 100) {
            fuelLevel = 100;
        }
        System.out.println(brand + " refueled by " + amount + "%. Current fuel level: " + fuelLevel + "%");
    }

    // Override showDetails method
    @Override
    public void showDetails() {
        System.out.println("Car Brand: " + brand + ", Speed: " + speed + " km/h, Fuel Level: " + fuelLevel + "%");
    }
}

// Subclass Bike
class Bike extends Vehicle {
    private boolean helmetOn;

    // Constructor
    public Bike(String brand, int speed, boolean helmetOn) {
        super(brand, speed);
        this.helmetOn = helmetOn;
    }

    // Method to wear a helmet
    public void wearHelmet() {
        helmetOn = true;
        System.out.println(brand + " rider is now wearing a helmet.");
    }

    // Override showDetails method
    @Override
    public void showDetails() {
        System.out.println("Bike Brand: " + brand + ", Speed: " + speed + " km/h, Helmet On: " + helmetOn);
    }
}

// Main class to demonstrate functionality
public class VehicleSystem {
    public static void main(String[] args) {
        // Instantiate a Car object
        Car car = new Car("Toyota", 60, 50);

        // Instantiate a Bike object
        Bike bike = new Bike("Yamaha", 40, false);

        // Perform actions on Car
        System.out.println("\nCar Actions:");
        car.accelerate(20);
        car.brake(30);
        car.refuel(30);
        car.showDetails();

        // Perform actions on Bike
        System.out.println("\nBike Actions:");
        bike.accelerate(15);
        bike.brake(10);
        bike.wearHelmet();
        bike.showDetails();
    }
}

