package singleton;

/**
 * 懒汉式线程安全版，性能效率低
 */
public class LazyLoadingSyn {
    /**
     * 描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
     * 优点：第一次调用才初始化，避免内存浪费。
     * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
     * getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。
     */
    private static LazyLoadingSyn instance;

    private LazyLoadingSyn (){}

    public static synchronized LazyLoadingSyn getInstance() {
        if (instance == null) {
            instance = new LazyLoadingSyn();
        }
        return instance;
    }
}
