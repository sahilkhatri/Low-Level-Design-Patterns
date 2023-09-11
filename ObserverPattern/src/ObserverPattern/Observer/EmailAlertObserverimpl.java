package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;


public class EmailAlertObserverimpl implements NotificationAlertObserver{
    
    String emailId;
    StocksObservable observable;

    public EmailAlertObserverimpl(String emailid, StocksObservable observable) {
        this.observable = observable;
        this.emailId = emailid;
    }

    public void update() {
        sendMail(emailId, "product is in stock");
    }

    private void sendMail(String emailId, String msg) {
        System.out.println("mail sent to : " + emailId);
    }
}
