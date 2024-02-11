public class SingletonWithThreadSafety {

    private static SingletonWithThreadSafety instance;

    public static synchronized SingletonWithThreadSafety getInstance() {
        if (instance == null) {
            instance = new SingletonWithThreadSafety();
        }
        return instance;
    }
}