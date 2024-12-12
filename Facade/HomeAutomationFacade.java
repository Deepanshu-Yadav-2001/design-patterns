public class HomeAutomationFacade {
    private final LightingSystem lighting;
    private final HeatingSystem heating;
    private final SecuritySystem security;
    private final EntertainmentSystem entertainment;

    public HomeAutomationFacade() {
        this.lighting = new LightingSystemImpl();
        this.heating = new HeatingSystemImpl();
        this.security = new SecuritySystemImpl();
        this.entertainment = new EntertainmentSystemImpl();
    }

    public void leaveHome() {
        lighting.turnOff();
        heating.turnOff();
        security.arm();
        entertainment.turnOffTV();
        System.out.println("All systems are set for leaving home.");
    }

    public void arriveHome() {
        lighting.turnOn();
        heating.turnOn();
        security.disarm();
        entertainment.turnOnTV();
        System.out.println("All systems are set for arriving home.");
    }

    public void playMusic(String song) {
        entertainment.playMusic(song);
    }

    public void setTemperature(int temperature) {
        heating.setTemperature(temperature);
    }

    public String checkSecurityStatus() {
        return security.getStatus();
    }
}
