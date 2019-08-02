package strategy;

public class CanQuack implements QuackBehavior{
    @Override
    public void Quack() {
        System.out.println("我叫出来了");
    }
}
