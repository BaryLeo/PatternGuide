package decorator;

public class DecoratorPatternDemo {
    public void runDemo(){
        System.out.println("修饰者模式");
        Component component = new Component();
        component.toString();
        ComponentA componentA = new ComponentA(component);
        ComponentB componentB = new ComponentB(component);
        ComponentAB componentAB = new ComponentAB(componentB);
        componentA.toString();
        componentB.toString();
        componentAB.toString();
    }
}
