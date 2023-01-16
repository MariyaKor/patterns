package org.example.abstractfactory.service.impl;

import org.example.abstractfactory.service.AbstractFactory;
import org.example.abstractfactory.service.BodyService;
import org.example.abstractfactory.service.EngineService;
import org.example.abstractfactory.service.WheelService;

public class LadaAbstractFactoryImpl implements AbstractFactory {
    @Override
    public EngineService getEngineService() {
        return new LadaEngineServiceImpl();
    }

    @Override
    public BodyService getBodyService() {
        return new LadaBodyServiceImpl();
    }

    @Override
    public WheelService getWheelService() {
        return new AudiWheelServiceImpl();
    }
}
