import singleton.SingletonService;

import java.util.List;

public class TestSingleton {
    public static void main(String[] args) {
        SingletonService singletonServiceFirst = SingletonService.getInstance();
        singletonServiceFirst.setNames(List.of("Alex", "Michael", "Carla"));
        SingletonService singletonServiceSecond = SingletonService.getInstance();
        System.out.println("names" + singletonServiceSecond.getNames());
    }
}
