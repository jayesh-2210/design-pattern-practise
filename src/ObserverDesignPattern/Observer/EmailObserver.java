package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class EmailObserver implements NotificationAlertObserver  {

    private final String email;
    private final StockObservable stockObservable;

    public EmailObserver(String email, StockObservable stockObservable) {
        this.email = email;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendEmail(email, "product is in stock hurry up");
    }

    private void sendEmail(String email, String message) {
        System.out.println("Sending email to " + email + ": " + message);
    }
}
