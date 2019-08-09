package observer;

import java.util.Observable;

/**
 * 阅读此代码时，建议先阅读Observable的代码
 */
public class WeatherData extends Observable {
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        dataChange();
    }

    public void dataChange(){
        //更新状态为已改变
        setChanged();
        //通知所有观察者
        notifyObservers();
    }

}
