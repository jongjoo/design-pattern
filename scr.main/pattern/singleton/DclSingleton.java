package pattern.singleton;

public class DclSingleton {

    private static volatile DclSingleton uniqueInstance;

    private DclSingleton() {
    }

    public static DclSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (DclSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DclSingleton();
                }
            }
        }
        return uniqueInstance;
    }

}
