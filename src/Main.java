import strategy.CanFly;
import strategy.CanQuack;
import strategy.CannotFly;
import strategy.Duck;

public class Main {

    public static void main(String[] args) {
        Duck duck = new Duck(new CanFly(),new CanQuack());
        Duck duck2 = new Duck(new CannotFly(),new CanQuack());
        duck.display();
        duck2.display();
    }
}
