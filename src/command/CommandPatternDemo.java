package command;

/**
 * 客户对象
 */
public class CommandPatternDemo {
    public void runDemo(){
        System.out.println("命令模式：");
        Stock abcStock = new Stock();

        BuyCommand buyStockOrder = new BuyCommand(abcStock);
        SellCommand sellStockOrder = new SellCommand(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
