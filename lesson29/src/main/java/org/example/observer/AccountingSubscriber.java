package org.example.observer;

import java.util.Observable;
import java.util.Observer;

public class AccountingSubscriber implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        User arg1 = (User) arg;
        System.out.println("This is accountant");
        System.out.println("preparing bill for " + arg1.getName());
    }
}
