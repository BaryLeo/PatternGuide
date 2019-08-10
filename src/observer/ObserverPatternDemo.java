package observer;

public class ObserverPatternDemo {
    public void runDemo(){
        System.out.println("观察者模式");
        WeatherData weatherData = new WeatherData();
        DataObserver dataObserver = new DataObserver(weatherData);
        for (int i = 0;i<5;i++){
            weatherData.setTemperature(i);
        }
    }
}
