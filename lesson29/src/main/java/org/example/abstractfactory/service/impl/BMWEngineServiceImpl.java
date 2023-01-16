package org.example.abstractfactory.service.impl;

import org.example.abstractfactory.model.Engine;
import org.example.abstractfactory.service.EngineService;

public class BMWEngineServiceImpl implements EngineService {
    @Override
    public Engine createEngine() {
        return new Engine("BMW engine");
    }
}
