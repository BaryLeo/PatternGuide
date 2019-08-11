package adapter;

public class AdapterPatternDemo {
    public void runDemo(){
        System.out.println("适配器模式，火鸡变成鸭子");
        System.out.println("\n鸭子出场:");
        DuckImpl duck = new DuckImpl();
        duck.quack();
        duck.fly();

        System.out.println("\n火鸡出场:");
        Turkey turkey = new Turkey();
        turkey.gobble();
        turkey.fly();

        System.out.println("\n火鸡开始混进了鸭群：");
        showTime(duck);
        showTime(new TurkeyAdapter(turkey));
    }

    private void showTime(Duck duck){
        duck.quack();
        duck.fly();
    }
}
