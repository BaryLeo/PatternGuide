import decorator.Component;
import decorator.ComponentA;
import decorator.ComponentAB;
import decorator.ComponentB;
import factory.Animal;
import factory.AnimalFactory;
import observer.DataObserver;
import observer.WeatherData;
import strategy.CanFly;
import strategy.CanQuack;
import strategy.CannotFly;
import strategy.Duck;

public class Main {

    public static void main(String[] args) {
        int key = 3;
        switch (key){
            case 0:{
                //策略模式
                System.out.println("策略模式");
                Duck duck = new Duck(new CanFly(),new CanQuack());
                Duck duck2 = new Duck(new CannotFly(),new CanQuack());
                duck.display();
                duck2.display();
                break;
            }
            case 1:{
                //观察者模式
                System.out.println("观察者模式");
                WeatherData weatherData = new WeatherData();
                DataObserver dataObserver = new DataObserver(weatherData);
                for (int i = 0;i<5;i++){
                    weatherData.setTemperature(i);
                }
            }
            case 2:{
                //修饰者模式
                System.out.println("修饰者模式");
                Component component = new Component();
                component.toString();
                ComponentA componentA = new ComponentA(component);
                ComponentB componentB = new ComponentB(component);
                ComponentAB componentAB = new ComponentAB(componentB);
                componentA.toString();
                componentB.toString();
                componentAB.toString();
            }
            case 3:{
                //工厂模式
                System.out.println("工厂模式");
                AnimalFactory animalFactory = new AnimalFactory();
                Animal a = animalFactory.getAnimal("Dog");
                a.sound();
                Animal b = animalFactory.getAnimal("Cat");
                b.sound();
                Animal c = animalFactory.getAnimal("Mouse");
                c.sound();
            }
        }
    }
}
