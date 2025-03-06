package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class SmsObserver implements NotificationAlertObserver  {

    private String mobileNumber;
    private StockObservable stockObservable;

    public SmsObserver(String mobileNumber, StockObservable stockObservable) {
        this.mobileNumber = mobileNumber;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendSmsAlert(mobileNumber, "product is in stock hurry up");
    }

    private void sendSmsAlert(String mobileNumber, String message) {
        // Send SMS alert using mobileNumber and message
        System.out.println("Sending SMS alert to " + mobileNumber + ": " + message);
    }
}
