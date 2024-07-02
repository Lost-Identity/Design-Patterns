import Observable.IphoneObservableImpl;
import Observable.StocksObservable;
import Observer.EmailNotificationAlertObserver;
import Observer.MobileNotificationAlertObserver;
import Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {

        StocksObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailNotificationAlertObserver("xcv@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new MobileNotificationAlertObserver("abc_user", iphoneStockObservable);
        NotificationAlertObserver observer3 = new EmailNotificationAlertObserver("asd@gmail.com", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }
}