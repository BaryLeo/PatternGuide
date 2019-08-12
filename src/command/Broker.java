package command;

import java.util.ArrayList;
import java.util.List;

/**
 * 调用命令的类
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    /**
     * 执行并清除命令队列
     */
    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}