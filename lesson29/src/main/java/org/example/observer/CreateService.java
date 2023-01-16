package org.example.observer;

import java.util.Observable;
import java.util.Observer;

public class CreateService extends Observable {

    public void createUser(User user) {
        System.out.println("create user");
        setChanged();
        notifyObservers(user);
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }
}
