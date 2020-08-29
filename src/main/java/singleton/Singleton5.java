package singleton;

public class Singleton5 {

    private static Singleton5 instance;
    private static Object obj = new Object();

    private Singleton5() {
    }

    public static Singleton5 getInstance() {

        synchronized (obj) {
            if (instance == null) {
                synchronized (obj) {
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}
