package singleton.exercise.two;

public enum TripleEnum {
    ALPHA("ALPHA"),
    BETA("BETA"),
    GAMMA("GAMMA");

    private String name;

    TripleEnum(String name) {
        this.name = name;
    }

    public static TripleEnum getInstance(String name) {
        return TripleEnum.valueOf(name);
    }
}
