package Observer;

import Observable.StocksObservable;

public class EmailNotificationAlertObserver implements NotificationAlertObserver{

    StocksObservable observable;
    String emailId;

    public EmailNotificationAlertObserver(String emailId, StocksObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(emailId, "product is in stock hurry up!");

    }

    private void sendEmail(String emailId, String msg){
        System.out.println("mail sent to:" + emailId);
        //send the actual email to the end user
    }
}
