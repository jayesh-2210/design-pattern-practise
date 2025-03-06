package ObserverDesignPattern;

import ObserverDesignPattern.Observable.IphoneStockObservableImplement;
import ObserverDesignPattern.Observable.StockObservable;
import ObserverDesignPattern.Observer.EmailObserver;
import ObserverDesignPattern.Observer.SmsObserver;

public class Stock {

    public static void main(String[] args) {
        StockObservable iphoneStock = new IphoneStockObservableImplement();

        EmailObserver observer1 = new EmailObserver("jayesh@gmail.com", iphoneStock);
        EmailObserver observer2 = new EmailObserver("sarah@gmail.com", iphoneStock);
        SmsObserver observer3 = new SmsObserver("9876543210", iphoneStock);

        iphoneStock.add(observer1);
        iphoneStock.add(observer2);
        iphoneStock.add(observer3);

        iphoneStock.setStockCount(50);
        iphoneStock.setStockCount(-50);
        iphoneStock.setStockCount(100);
    }

}
