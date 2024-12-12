public class EntertainmentSystemImpl implements EntertainmentSystem {
    private boolean on;

    public EntertainmentSystemImpl() {
        on = false;
    }

    @Override
    public void playMusic(String song) {
        if (!on) {
            System.out.println("TV is switched off");
            return;
        }
        System.out.println("Playing the song " + song + "...");
    }

    @Override
    public void turnOnTV() {
        if (on) {
            System.out.println("TV is already on");
            return;
        }
        System.out.println("Turning on the TV");
        on = true;
    }

    @Override
    public void turnOffTV() {
        if (!on) {
            System.out.println("TV is already off");
            return;
        }
        System.out.println("Turning off the TV");
        on = false;
    }
}
