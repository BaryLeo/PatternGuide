package strategy;

public class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior,QuackBehavior quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void display() {
        flyBehavior.fly();
        quackBehavior.Quack();
    }
}
