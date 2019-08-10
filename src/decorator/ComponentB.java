package decorator;

public class ComponentB extends Component {
    //被装饰者
    private Component component;

    public ComponentB(Component component){
        this.component = component;
    }

    @Override
    public String getInfo() {
        return "我是组件B";
    }


    /**
     * 组件B是基于原始组件改良，所以值比原始组件高，不修改原始对象而增加某部分功能，是目的
     * @return
     */
    @Override
    public int getTotalNum() {
        return 1+super.getTotalNum();
    }

    @Override
    public String toString() {
        System.out.println(this.getInfo()+",值为:"+this.getTotalNum());
        return this.getInfo()+",值为:"+this.getTotalNum();
    }
}
