package iterator;

import java.util.ArrayList;

public class IteratorPatternDemo {
    public void runDemo(){
        System.out.println("迭代器模式，用同一迭代器，迭代数组和ArrayList，可以拓展枚举类型甚至更多，有点类似适配器，请看代码");
        ArrayList<Iterator> iterators = new ArrayList<>();

        ArraryModel arraryModel = new ArraryModel();
        iterators.add(arraryModel);

        ListModel listModel = new ListModel();
        iterators.add(listModel);

        for (Iterator iterator : iterators){
            while (iterator.hasNext()){
                System.out.print(iterator.getNext()+"  ");
            }
        }
    }
}
