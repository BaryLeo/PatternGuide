package command;

/**
 * 携带命令的类
 */
public class SellCommand implements Order{
    private Stock abcStock;

    public SellCommand(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
