package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;


public class MobileAlertObserverimpl implements NotificationAlertObserver {

    String userName;
    StocksObservable observable;

    public MobileAlertObserverimpl(String emailId, StocksObservable observable) {
        this.observable = observable;
        this.userName = emailId;
    }

    public void update() { sendMsgOnMobile(userName, "product is in stock");}

    private void sendMsgOnMobile(String userName, String msg) {
        System.out.println("msg sent to : " + userName);
    }
}
