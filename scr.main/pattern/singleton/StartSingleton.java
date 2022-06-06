package pattern.singleton;

public class StartSingleton {

    private static StartSingleton uniqueInstance = new StartSingleton();

    private StartSingleton() {
    }

    public static StartSingleton getInstance() {
        return uniqueInstance;
    }
}
