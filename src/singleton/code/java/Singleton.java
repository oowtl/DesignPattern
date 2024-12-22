package singleton.code.java;

public class Singleton {
    // private
    private static Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // factory method pattern
    public static Singleton getInstance() {
        return instance;
    }
}
