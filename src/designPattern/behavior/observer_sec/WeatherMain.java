package designPattern.behavior.observer_sec;

public class WeatherMain {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentWeatherDisplay currentDisplay = new CurrentWeatherDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);

		weatherData.removeObserver(forecastDisplay);
	}

}
