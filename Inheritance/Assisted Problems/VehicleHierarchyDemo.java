class VehicleBase {
    int maxSpeed;
    String fuelType;

    VehicleBase(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
    }
}

class CarVehicle extends VehicleBase {
    int seatCapacity;

    CarVehicle(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class TruckVehicle extends VehicleBase {
    double loadCapacity;

    TruckVehicle(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

class MotorcycleVehicle extends VehicleBase {
    boolean hasCarrier;

    MotorcycleVehicle(int maxSpeed, String fuelType, boolean hasCarrier) {
        super(maxSpeed, fuelType);
        this.hasCarrier = hasCarrier;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Has Carrier: " + hasCarrier);
    }
}

public class VehicleHierarchyDemo {
    public static void main(String[] args) {
        VehicleBase[] vehicles = {
                new CarVehicle(180, "Petrol", 5),
                new TruckVehicle(120, "Diesel", 15),
                new MotorcycleVehicle(100, "Petrol", true)
        };

        for (VehicleBase v : vehicles) {
            v.displayInfo();
            System.out.println();
        }
    }
}
