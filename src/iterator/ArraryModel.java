package iterator;

public class ArraryModel implements Iterator{
    Integer[] ar = {1,2,3,4,5,6,7,8,9};
    int count = 0;

    @Override
    public boolean hasNext() {
        if (count < ar.length &&ar[count]!=null){
            return true;
        }
        return false;
    }

    @Override
    public Object getNext() {
        if (hasNext()){
            int a = count;
            count++;
            return ar[a];
        }
        return null;
    }
}
