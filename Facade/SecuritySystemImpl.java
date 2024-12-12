public class SecuritySystemImpl implements SecuritySystem {
    @Override
    public void arm() {
        System.out.println("Security system is armed.");
    }

    @Override
    public void disarm() {
        System.out.println("Security system is disarmed.");
    }

    @Override
    public String getStatus() {
        return "Security system status: All secure.";
    }
}
