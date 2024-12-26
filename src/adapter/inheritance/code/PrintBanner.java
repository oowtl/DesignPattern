package adapter.inheritance.code;

// PrintBanner 가 Adapter 에 해당한다.
// Print 를 구현하고 있어서 Print 의 메서드를 오버라이딩 하고 있으나 Banner 를 상속받고 이어서 오버라이딩한 메서드를 Banner 의 메서드로 완성시킬 수 있다.
public class PrintBanner extends Banner implements Print{

    PrintBanner(String input) {
        super(input);
    }

    @Override
    public void printWeak() {
        super.showWithParen();
    }

    @Override
    public void printStrong() {
        super.showWithAster();
    }
}
