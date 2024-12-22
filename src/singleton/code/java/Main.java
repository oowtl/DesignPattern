package singleton.code.java;

public class Main {
    public static void main(String[] args) {
        // singleton pattern 시작
        // Singleton Pattern - Start 이 먼저 출력된다. => singleton 을 호출하면 그 때 생성된다.
        System.out.println("Singleton Pattern - Start");

        // singleton pattern 인스턴스 생성
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        // 두 인스턴스가 같은지 확인
        if (s1 == s2) {
            System.out.println("Both instances are the same");
        } else {
            System.out.println("Both instances are different");
        }

        System.out.println("Singleton Pattern - End");
    }
}
