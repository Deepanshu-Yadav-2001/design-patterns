public class HeatingSystemImpl implements HeatingSystem {
    private boolean on;
    private int temperature;

    public HeatingSystemImpl() {
        on = false;
    }

    @Override
    public void turnOff() {
        if (!on) {
            System.out.println("Heater is already off");
            return;
        }
        System.out.println("Turning off the heater");
        on = false;
    }

    @Override
    public void turnOn() {
        if (on) {
            System.out.println("Heater is already on");
            return;
        }
        System.out.println("Turning on the heater. The default temperature is 60 degrees celsius");
        on = true;
        temperature = 60;
    }

    @Override
    public void setTemperature(int temperature) {
        if (!on) {
            System.out.println("Please turn on the heater first");
            return;
        }
        if (temperature > 100 || temperature < 20) {
            System.out.println("Temperature can be between 20 and 100");
            return;
        }
        System.out.println("Setting the temperature to: " + temperature + " degrees celsius");
        this.temperature = temperature;
    }
}
