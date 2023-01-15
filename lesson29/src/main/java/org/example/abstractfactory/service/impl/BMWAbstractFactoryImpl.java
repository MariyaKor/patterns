package org.example.abstractfactory.service.impl;

import org.example.abstractfactory.service.AbstractFactory;
import org.example.abstractfactory.service.BodyService;
import org.example.abstractfactory.service.EngineService;
import org.example.abstractfactory.service.WheelService;

public class BMWAbstractFactoryImpl implements AbstractFactory {
    @Override
    public EngineService getEngineService() {
        return new BMWEngineServiceImpl();
    }

    @Override
    public BodyService getBodyService() {
        return new BMWBodyServiceImpl();
    }

    @Override
    public WheelService getWheelService() {
        return new BMWheelServiceImpl();
    }
}
