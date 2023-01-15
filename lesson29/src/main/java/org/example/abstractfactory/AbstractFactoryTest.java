package org.example.abstractfactory;

import org.example.abstractfactory.service.impl.LadaAbstractFactoryImpl;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        MainService factory = new MainService();
        factory.createCar(new LadaAbstractFactoryImpl());
    }
}
