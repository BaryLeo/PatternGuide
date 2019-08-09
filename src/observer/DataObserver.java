package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 建议先阅读Observer的代码，已经放在代码下方
 */
public class DataObserver implements Observer {
    //利用集合的思想，通过父类来定义一个集合
    Observable observable;
    private int tmp;

    public DataObserver(Observable observable){
        //目标对象
        this.observable = observable;
        //将本对象注册为目标对象的观察者
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            //向下转型
            WeatherData weatherData = (WeatherData)o;
            this.tmp = weatherData.getTemperature();
            print();
        }
    }

    private void print(){
        System.out.println("Observer最新数据:"+tmp);
    }
}

/**
 * public class Observable {
 *     private boolean changed = false;
 *
 *     private Vector<Observer> obs;
 *
 *     public Observable() {
 *         obs = new Vector<>();
 *     }
 *
 *
 *     public synchronized void addObserver(Observer o) {
 *         if (o == null)
 *             throw new NullPointerException();
 *         if (!obs.contains(o)) {
 *             obs.addElement(o);
 *         }
 *     }
 *
 *
 *     public synchronized void deleteObserver(Observer o) {
 *         obs.removeElement(o);
 *     }
 *
 *     public void notifyObservers() {
 *         notifyObservers(null);
 *     }
 *
 *     public void notifyObservers(Object arg) {
 *         Object[] arrLocal;
 *
 *         synchronized (this) {
 *             if (!changed)
 *                 return;
 *             arrLocal = obs.toArray();
 *             clearChanged();
 *         }
 *
 *         for (int i = arrLocal.length-1; i>=0; i--)
 *             ((Observer)arrLocal[i]).update(this, arg);
 *     }
 *
 *
 *     public synchronized void deleteObservers() {
 *         obs.removeAllElements();
 *     }
 *
 *
 *     protected synchronized void setChanged() {
 *         changed = true;
 *     }
 *
 *
 *     protected synchronized void clearChanged() {
 *         changed = false;
 *     }
 *
 *
 *     public synchronized boolean hasChanged() {
 *         return changed;
 *     }
 *
 *
 *     public synchronized int countObservers() {
 *         return obs.size();
 *     }
 * }
 */