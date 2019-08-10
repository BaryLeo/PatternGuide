package singleton;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）,仅适用于1.5和之后的Java
 */
public class DCL {
    /**
     * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
     * getInstance() 的性能对应用程序很关键。
     *
     * 用volatile修饰的变量，线程在每次使用变量的时候，都会读取变量修改后的最的值。volatile很容易被误用，用来进行原子性操作。
     */
    private volatile static DCL dcl;

    private DCL (){}

    public static DCL getDCL() {
        if (dcl == null) {
            /**
             * synchronized(DCL.class)是对DCL这个类进行加锁，类里面的属性，方法都是同步的，是针对于特定的类的
             * 也就是说，这里面的代码，仅执行一次
             */
            synchronized (DCL.class) {
                if (dcl == null) {
                    dcl = new DCL();
                }
            }
        }
        return dcl;
    }
}
