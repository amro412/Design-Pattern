public class SingletonWithoutThreadSafety {

    private static SingletonWithoutThreadSafety instance;

    public static SingletonWithoutThreadSafety getInstance() {
        if (instance == null) {
            instance = new SingletonWithoutThreadSafety();
        }
        return instance;
    }
}