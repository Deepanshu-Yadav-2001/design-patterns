public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        weatherData.addSubscriber(currentDisplay);
        weatherData.addSubscriber(statisticsDisplay);

        weatherData.updateWeather(80, 65, 30);
        weatherData.updateWeather(83, 70, 29);
        weatherData.updateWeather(78, 90, 29);
    }
}