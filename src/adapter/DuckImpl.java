package adapter;

public class DuckImpl implements Duck {
    @Override
    public void quack() {
        System.out.println("我是鸭子");
    }

    @Override
    public void fly() {
        System.out.println("我飞得比较快");
    }
}
