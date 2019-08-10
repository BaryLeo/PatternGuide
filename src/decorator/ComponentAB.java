package decorator;

public class ComponentAB extends ComponentA {
    //复杂组合，将A修饰B，的到AB
    private Component component;

    public ComponentAB(Component component) {
        super(component);
        this.component = component;
    }

    @Override
    public String getInfo() {
        return "我是组件AB";
    }


    /**
     * 组件AB是基于原始组件A和B组合，所以值比原始组件高，不修改原始对象而增加某部分功能，是目的
     * @return
     */
    @Override
    public int getTotalNum() {
        return component.getTotalNum()+super.getTotalNum();
    }

    @Override
    public String toString() {
        System.out.println(this.getInfo()+",值为:"+this.getTotalNum());
        return this.getInfo()+",值为:"+this.getTotalNum();
    }
}
