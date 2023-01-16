package org.example.observer;

import java.util.Observable;
import java.util.Observer;

public class AdminSubscriber implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        User arg1 = (User) arg;
        System.out.println("This is admin");
        System.out.println("preparing computer for " + arg1.getName());
    }
}
