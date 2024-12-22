package singleton.exercise.two;

public class TripleClass {
    // 인스턴스 개수 제한
    private static final int MAX_COUNT = 3;
    // TripleClass는 3개의 인스턴스만 생성할 수 있다.
    private static TripleClass[] instanceList = new TripleClass[MAX_COUNT];
    // 배열에 넣어야 하기 때문에 카운트를 한다.
    private static int instanceListCnt = 0;

    // 허용하는 이름
    private static final String[] ALLOWED_NAMES = {"ALPHA", "BETA", "GAMMA"};

    // 이름을 가진다.
    private String name;

    public String getName() {
        return this.name;
    }

    // 생성자를 private로 선언하여 외부에서 생성자를 호출하지 못하게 한다.
    private TripleClass(String name) {
        this.name = name;
    }

    // getInstance 메서드를 통해 이름을 받아서 객체를 반환한다.
    public static TripleClass getInstance(String name) {
        // 허용하는 이름인지 확인한다.
        if (!isAllowedName(name)) {
            System.out.println("허용되지 않는 이름입니다.");
            return null;
        }

        // 이름에 해당하는 객체가 이미 생성되어 있는지 확인한다.
        // 생성되었다면 생성된 것을 반환하고 생성되지 않았다면 만들어서 반환한다.
        TripleClass instance = findByName(name);
        if (instance == null) {
            instance = createByName(name);
        }

        return instance;
    }

    private static boolean isAllowedName(String name) {
        for (String allowedName : ALLOWED_NAMES) {
            if (allowedName.equals(name)) {
                return true;
            }
        }
        return false;
    }

    private static TripleClass findByName(String name) {
        for (TripleClass tripleClass : instanceList) {
            if (tripleClass != null && tripleClass.getName().equals(name)) {
                return tripleClass;
            }
        }
        return null;
    }

    private static TripleClass createByName(String name) {
        if (instanceListCnt >= MAX_COUNT) {
            System.out.println("더이상 생성할 수 없습니다.");
            return null;
        }

        // 추가하기
        TripleClass tripleClass = new TripleClass(name);
        // 배열에 넣은 후 숫자를 더해준다.
        instanceList[instanceListCnt++] = tripleClass;

        return tripleClass;
    }
}
