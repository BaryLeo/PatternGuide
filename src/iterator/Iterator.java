package iterator;

public interface Iterator<T> {
    //Java本身就有，可以参考源代码，这里只是贴出来方便看
    boolean hasNext();

    default void remove() {
        throw new UnsupportedOperationException("remove");
    }

    T getNext();
}
