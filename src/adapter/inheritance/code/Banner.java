package adapter.inheritance.code;

public class Banner {
    private String content;

    Banner (String input) {
        this.content = input;
    }

    public void showWithParen() {
        System.out.println("(" + content + ")");
    }

    public void showWithAster() {
        System.out.println("*" + content + "*");
    }
}
