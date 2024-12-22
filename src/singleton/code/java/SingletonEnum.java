package singleton.code.java;

// enum 으로 singleton pattern 구현
public enum SingletonEnum {
    INSTANCE;

    public void check() {
        System.out.println("Check SingletonEnum Class instance created");
    }
}
