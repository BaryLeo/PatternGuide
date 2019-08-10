package singleton;

/**
 * 线程不安全版本，当需要时才会创建对象，为懒汉式，不支持多线程
 */
public class LazyLoading {
    /**
     * 在某些Java版本中，若单例长时间未被引用，则会被GC收集，再次调用获取单件时，将是全新单件，以前的数据全无，所以采用静态引用
     */
    private static LazyLoading instance;

    private LazyLoading (){}

    public static LazyLoading getInstance() {
        /**
         * 这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
         * 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
         */
        if (instance == null) {
            instance = new LazyLoading();
        }
        return instance;
    }
}
