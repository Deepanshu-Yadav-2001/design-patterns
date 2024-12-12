public class LightingSystemImpl implements LightingSystem {
    private boolean on;
    private int intensity;

    public LightingSystemImpl() {
        on = false;
    }

    @Override
    public void turnOff() {
        if (!on) {
            System.out.println("Light is already off");
            return;
        }
        System.out.println("Switching off the light");
        on = false;
    }

    @Override
    public void turnOn() {
        if (on) {
            System.out.println("Light is already on");
            return;
        }
        System.out.println("Switching on the light");
        on = true;
        intensity = 10;
    }

    @Override
    public void dim(int level) {
        if (!on) {
            System.out.println("Please switch on the light first");
            return;
        }
        if (level > 10 || level < 1) {
            System.out.println("Intensity can be between 1 and 10");
            return;
        }
        System.out.println("Setting the light intensity to: " + level);
        intensity = level;
    }
}
