package Observer;

import Observable.StocksObservable;
public class MobileNotificationAlertObserver implements NotificationAlertObserver{

    StocksObservable observable;
    String userName;

    public MobileNotificationAlertObserver(String userName, StocksObservable observable){
        this.observable = observable;
        this.userName = userName;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName, "product is in stock hurry up!");
    }

    private void sendMsgOnMobile(String userName, String msg){
        System.out.println("Msg sent to: " + userName);
        //send the actual msg to the end user
    }
}
