package strategy;

/**
 * fly一族的算法
 */
public class CannotFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("飞不起来呀");
    }
}
