public class MultiThreads {

    private int sharedVariable;

    public synchronized void modifySharedVariable(int newValue) {
        sharedVariable = newValue;
    }

    public synchronized int getSharedVariable() {
        return sharedVariable;
    }
}