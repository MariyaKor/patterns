package org.example.abstractfactory;

import org.example.abstractfactory.model.Body;
import org.example.abstractfactory.model.Engine;
import org.example.abstractfactory.model.Wheel;
import org.example.abstractfactory.service.AbstractFactory;
import org.example.abstractfactory.service.BodyService;
import org.example.abstractfactory.service.EngineService;
import org.example.abstractfactory.service.WheelService;

public class MainService {

    void createCar(AbstractFactory factory) {

        EngineService engineService = factory.getEngineService();
        Engine engine = engineService.createEngine();
        System.out.println(engine);

        BodyService bodyService = factory.getBodyService();
        Body body = bodyService.createBody();
        System.out.println(body);

        WheelService wheelService = factory.getWheelService();
        Wheel wheel = wheelService.createWheel();
        System.out.println(wheel);
    }
}
