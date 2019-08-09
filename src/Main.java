import observer.DataObserver;
import observer.WeatherData;
import strategy.CanFly;
import strategy.CanQuack;
import strategy.CannotFly;
import strategy.Duck;

public class Main {

    public static void main(String[] args) {
        int key = 1;
        switch (key){
            case 0:{
                //策略模式
                Duck duck = new Duck(new CanFly(),new CanQuack());
                Duck duck2 = new Duck(new CannotFly(),new CanQuack());
                duck.display();
                duck2.display();
                break;
            }
            case 1:{
                //观察者模式
                WeatherData weatherData = new WeatherData();
                DataObserver dataObserver = new DataObserver(weatherData);
                for (int i = 0;i<5;i++){
                    weatherData.setTemperature(i);
                }
            }
        }
    }
}
