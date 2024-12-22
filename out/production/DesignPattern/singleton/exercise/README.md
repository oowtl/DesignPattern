# 문제 5-1

TicketMaker 클래스(리스트 5-3)는 getNextTicketNumber 메서드를 호출할 때마다 1000, 1001, 1002, ... 같은 숫자를 반환해서 티켓 번호와 일련번호를 생성하는 데 사용합니다.
이 TicketMaker 클래스는 현재 상태대로 인스턴스를 몇 개라도 만들 수 있습니다.
여기에 Singleton 패턴을 적용해 인스턴스가 하나만 만들어지도록 변경하세요.

```java
public class TicketMaker {
    private int ticket = 1000;

    public int getNextTicketNumber() {
        return ticket++;
    }
}
```
TicketMaker 클래스를 Singleton 패턴으로 수정한 코드를 작성하세요.

# 문제 5-2
인스턴스 수가 3개로 제한된 클래스 Triple을 만드세요.
인스턴스에는 "ALPHA", "BETA", "GAMMA"라는 이름이 붙어 있고,
getInstance(String name)으로 이름을 가진 인스턴스를 얻을 수 있도록 구현합니다.

# 문제 5-3
어떤 사람이 Singleton 클래스를 리스트 5-4처럼 만들었습니다.
그러나 이 상태에서 getInstance 메소드가 여러 스레드에서 호출되면 Singleton 패턴이 되지 않습니다.
어째서일까요?

```java
public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("인스턴스를 생성했습니다.");
    }
    
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
```
