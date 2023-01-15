package singleton;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * realization of Singleton pattern
 */
@Getter
@Setter
public class SingletonService {

    private static SingletonService singletonService;
    private List<String> names;
    private SingletonService() {

    }

    public static SingletonService getInstance() {
        if (singletonService == null) {
            synchronized (SingletonService.class) {
                if (singletonService == null) {
                    singletonService = new SingletonService();
                }
            }

        }
        return singletonService;
    }

}
