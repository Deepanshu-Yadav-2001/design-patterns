import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    List<Observer> observers = new ArrayList<>();
    Weather weather = new Weather();

    @Override
    public void addSubscriber(Observer observer) {
        if (observers.contains(observer)) {
            throw new RuntimeException("Already a subscriber");
        }
        observers.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (Observer observer: observers) {
            observer.update(weather);
        }
    }

    public void updateWeather(int temperature, int humidity, int windSpeed) {
        weather = new Weather(temperature, humidity, windSpeed);

        notifySubscribers();
    }
}
