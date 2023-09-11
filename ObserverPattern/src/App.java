
import ObserverPattern.Observable.IphoneObservableimpl;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observer.EmailAlertObserverimpl;
import ObserverPattern.Observer.MobileAlertObserverimpl;
import ObserverPattern.Observer.NotificationAlertObserver;


public class App {
    public static void main(String[] args) {

        StocksObservable iphoneStockObservable = new IphoneObservableimpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverimpl("xyz1@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverimpl("xyz2@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverimpl("xyz_username", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(11);

    }
}
