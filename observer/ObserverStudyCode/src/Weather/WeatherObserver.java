package Weather;

public interface WeatherObserver {
    void update(float temp, float humidity, float pressure);
}
