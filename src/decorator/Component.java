package decorator;

public class Component {
    private String info;
    private int num;

    public Component(){
        info = "我是原始组件";
        num = 1;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


    //将要被装饰的目标功能
    public int getTotalNum(){
        return num;
    }

    @Override
    public String toString() {
        System.out.println(info+",值为:"+num);
        return info+",值为:"+num;
    }
}
