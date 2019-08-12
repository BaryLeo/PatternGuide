package command;

/**
 * 携带命令的类
 */
public class BuyCommand implements Order {
    private Stock abcStock;

    public BuyCommand(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
