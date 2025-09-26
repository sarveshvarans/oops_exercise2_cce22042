

class Device {
    String brand;
    Device(String brand) {
        this.brand = brand;
    }
    void turnOn() {
        System.out.println(brand + " device is ON.");
    }
    void turnOff() {
        System.out.println(brand + " device is OFF.");
    }
}

class Light extends Device {
    Light(String brand) {
        super(brand);
    }
    void dim(int level) {
        System.out.println(brand + " light dimmed to " + level + "%.");
    }
}

class Thermostat extends Device {
    Thermostat(String brand) {
        super(brand);
    }
    void setTemperature(int temp) {
        System.out.println(brand + " thermostat set to " + temp + "°C.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Light philipsLight = new Light("Philips");
        philipsLight.turnOn();
        philipsLight.dim(50);
        philipsLight.turnOff();

        Thermostat nestThermostat = new Thermostat("Nest");
        nestThermostat.turnOn();
        nestThermostat.setTemperature(22);
    }
}
