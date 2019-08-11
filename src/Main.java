import abstractfactory.*;
import adapter.AdapterPatternDemo;
import decorator.*;
import factory.Animal;
import factory.AnimalFactory;
import factory.FactoryPatternDemo;
import iterator.IteratorPatternDemo;
import observer.DataObserver;
import observer.ObserverPatternDemo;
import observer.WeatherData;
import strategy.*;

public class Main {

    public static void main(String[] args) {
        int key = 6;
        switch (key){
            case 0:{
                //策略模式
                StrategyPatternDemo strategyPatternDemo = new StrategyPatternDemo();
                strategyPatternDemo.runDemo();
                break;
            }
            case 1:{
                //观察者模式
                ObserverPatternDemo observerPatternDemo = new ObserverPatternDemo();
                observerPatternDemo.runDemo();
                break;
            }
            case 2:{
                //修饰者模式
                DecoratorPatternDemo decoratorPatternDemo = new DecoratorPatternDemo();
                decoratorPatternDemo.runDemo();
                break;
            }
            case 3:{
                //工厂模式
                FactoryPatternDemo factoryPatternDemo = new FactoryPatternDemo();
                factoryPatternDemo.runDemo();
                break;
            }
            case 4:{
                /**
                 * 抽象工厂模式，其实就是将一类产品的工厂集合在一起，就是一个超级工厂包含着工厂模式
                 */
                AbstractFactoryPatternDemo abstractFactoryPatternDemo = new AbstractFactoryPatternDemo();
                abstractFactoryPatternDemo.runDemo();
                break;
            }
            case 5:{
                System.out.println("在singleton中，有详细介绍四种创建单例的模式");
                break;
            }
            case 6:{
                //适配器模式
                AdapterPatternDemo adapterPatternDemo = new AdapterPatternDemo();
                adapterPatternDemo.runDemo();
                break;
            }
            case 7:{
                //迭代器模式
                IteratorPatternDemo iteratorPatternDemo = new IteratorPatternDemo();
                iteratorPatternDemo.runDemo();
                break;
            }
        }
    }
}
