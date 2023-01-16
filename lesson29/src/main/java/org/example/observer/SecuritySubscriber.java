package org.example.observer;

import java.util.Observable;
import java.util.Observer;

public class SecuritySubscriber implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        User arg1 = (User) arg;
        System.out.println("This is securityMan");
        System.out.println("preparing id card for " + arg1.getName());
    }
}
