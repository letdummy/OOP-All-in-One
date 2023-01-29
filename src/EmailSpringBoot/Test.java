package EmailSpringBoot;

public class Test {
    public static int test = 0;

    public static void addTest(int score){
        test += score;
    }
    public static void main(String[] args) {
        System.out.println("Test = " + test);
        addTest(10);
        System.out.println("Test = " + test);
    }
}
