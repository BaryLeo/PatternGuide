package adapter;

public class TurkeyAdapter implements Duck{
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
        System.out.println("但我混进了鸭子的队伍中，不信你看AdapterPatternDemo代码");
    }

    @Override
    public void fly() {
        turkey.fly();
        System.out.println("我飞得慢，但是还是没被发现，我进了鸭子的集群");
    }
}
