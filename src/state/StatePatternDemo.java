package state;

/**
 * Context相当于一个角色，而各种状态则像观察者，但又不止于观察者，因为在角色经过状态者的时候，状态者会修改角色的状态
 */
public class StatePatternDemo {
    public void runDemo() {
        System.out.println("状态模式");
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}