package org.example.abstractfactory.service.impl;

import org.example.abstractfactory.model.Body;
import org.example.abstractfactory.service.BodyService;

public class LadaBodyServiceImpl implements BodyService {
    @Override
    public Body createBody() {
        return new Body("Lada body");
    }
}
