package org.example.abstractfactory.service.impl;

import org.example.abstractfactory.model.Wheel;
import org.example.abstractfactory.service.WheelService;

public class BMWheelServiceImpl implements WheelService {
    @Override
    public Wheel createWheel() {
        return new Wheel("BMW wheel");
    }
}