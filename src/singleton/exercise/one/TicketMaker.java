package singleton.exercise.one;

public class TicketMaker {
    private int ticket = 1000;

    // singleton instance
    private static TicketMaker instance;

    // private 접근제어자로 생성 제한
    private TicketMaker () {

    }

    // instance 가 없다면 생성
    public TicketMaker getInstance() {
        if (instance == null) {
            instance = new TicketMaker();
        }
        return instance;
    }

    public int getNextTicketNumber() {
        return ticket++;
    }
}