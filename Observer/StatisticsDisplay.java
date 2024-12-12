import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements Observer {
    List<Weather> everydayWeather = new ArrayList<>();

    @Override
    public void update(Weather weather) {
        everydayWeather.add(weather);
        display();
    }

    public void display() {
        List<Integer> temperatures = everydayWeather.stream().map(Weather::getTemperature).toList();
        double averageTemp = (double) (temperatures.stream().reduce(Integer::sum)).get() / (temperatures.size());
        System.out.printf("The average temperature is %s degree Celsius\n", averageTemp);
    }
}
