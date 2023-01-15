package org.example.abstractfactory.service;

public interface AbstractFactory {

    EngineService getEngineService();
    BodyService getBodyService();
    WheelService getWheelService();
}
