package org.example.observer;

public class MainService {
    public static void main(String[] args) {
        CreateService service = new CreateService();
        service.addObserver(new SecuritySubscriber());
        service.addObserver(new AccountingSubscriber());
        service.addObserver(new AdminSubscriber());
        service.createUser(new User("Ann"));
    }
}
