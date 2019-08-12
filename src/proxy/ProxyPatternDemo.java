package proxy;

/**
 * 目地是避免多次重复某个动作，在本例，不需要多次从硬盘中读取资料，内含单例模式
 */
public class ProxyPatternDemo {
    public void runDemo(){
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载,多次使用后都不会，除非被GC清除了
        image.display();
    }
}
