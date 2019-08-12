package facade;

/**
 * 即利用集合关系，形成一个大的接口,隐藏系统的复杂性
 */
public class FacadePatternDemo {
    public void runDemo() {
        System.out.println("外观模式");
        ShapeMaker shapeMaker = new ShapeMaker();

        /**
         * 无需理会内部是如何形成的，内部已经集合成一统一接口
         */
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}