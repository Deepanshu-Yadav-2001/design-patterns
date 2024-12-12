public class CurrentConditionsDisplay implements Observer {
    Weather weather;

    @Override
    public void update(Weather weather) {
        this.weather = weather;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + weather.getTemperature() + "C degrees and " + weather.getHumidity() + "% humidity");
    }
}
