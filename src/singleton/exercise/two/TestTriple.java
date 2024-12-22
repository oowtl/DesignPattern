package singleton.exercise.two;

public class TestTriple {
    public static void main(String[] args) {
        System.out.println("======ENUM SINGLETON======");
        // Enum 으로 구현
        TripleEnum alphaEnum = TripleEnum.getInstance("ALPHA");
        TripleEnum betaEnum = TripleEnum.getInstance("BETA");
        TripleEnum gammaEnum = TripleEnum.getInstance("GAMMA");

        System.out.println(alphaEnum);
        System.out.println(betaEnum);
        System.out.println(gammaEnum);

        System.out.println("======CLASS SINGLETON======");
        // Class 으로 구현
        TripleClass alphaClass = TripleClass.getInstance("ALPHA");
        TripleClass betaClass = TripleClass.getInstance("BETA");
        TripleClass gammaClass = TripleClass.getInstance("GAMMA");

        System.out.println(alphaClass.getName());
        System.out.println(betaClass.getName());
        System.out.println(gammaClass.getName());
    }
}
