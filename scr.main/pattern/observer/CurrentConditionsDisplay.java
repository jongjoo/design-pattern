package pattern.observer;

public class CurrentConditionsDisplay implements Observer {

    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("현재 상태 : 온도 " + temperature + "F, 습도 " + humidity + "%");
    }

}
