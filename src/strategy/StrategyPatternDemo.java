package strategy;

public class StrategyPatternDemo {
    public void runDemo(){
        System.out.println("策略模式");
        Duck duck = new Duck(new CanFly(),new CanQuack());
        Duck duck2 = new Duck(new CannotFly(),new CanQuack());
        duck.display();
        duck2.display();
    }
}
