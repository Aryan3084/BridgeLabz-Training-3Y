interface Refuelable {
    void refuel();
}

class VehicleBaseHybrid {
    int maxSpeed;
    String model;

    VehicleBaseHybrid(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

class ElectricVehicleHybrid extends VehicleBaseHybrid {
    ElectricVehicleHybrid(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println(model + " (Electric Vehicle) is charging.");
    }
}

class PetrolVehicleHybrid extends VehicleBaseHybrid implements Refuelable {
    PetrolVehicleHybrid(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println(model + " (Petrol Vehicle) is refueling.");
    }
}

public class VehicleHybridDemo {
    public static void main(String[] args) {
        ElectricVehicleHybrid ev = new ElectricVehicleHybrid(150, "Tesla Model 3");
        PetrolVehicleHybrid pv = new PetrolVehicleHybrid(180, "Honda Civic");

        ev.charge();
        pv.refuel();
    }
}
