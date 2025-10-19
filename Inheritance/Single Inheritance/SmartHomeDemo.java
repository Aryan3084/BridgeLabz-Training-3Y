class DeviceUnit {
    String deviceId;
    String status;

    DeviceUnit(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}

class ThermostatDevice extends DeviceUnit {
    double temperatureSetting;

    ThermostatDevice(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class SmartHomeDemo {
    public static void main(String[] args) {
        ThermostatDevice thermostat = new ThermostatDevice("T1001", "ON", 22.5);
        thermostat.displayStatus();
    }
}
