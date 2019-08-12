package template;

/**
 * 也是利用集合的思想，通过继承抽象类，来定义不同细节的算法，在使用的时候，也能灵活运用
 */
public class TemplatePatternDemo {
    public void runDemo(){
        System.out.println("模板模式");
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
