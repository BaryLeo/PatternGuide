package iterator;

import java.util.ArrayList;

public class ListModel implements Iterator{
    ArrayList<Integer> integers = new ArrayList<>();
    int count = 0;

    public ListModel(){
        for (int i = 0;i<6;i++){
            integers.add(i);
        }
    }
    @Override
    public boolean hasNext() {
        if (count<integers.size()){
            return true;
        }
        return false;
    }

    @Override
    public Object getNext() {
        if (hasNext()){
            int a = count;
            count++;
            return integers.get(a);
        }
        return null;
    }
}
