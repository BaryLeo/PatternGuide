package strategy;

/**
 * 贴上fly行为的标签
 */
public class CanFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("我能飞");
    }
}
