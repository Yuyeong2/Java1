package test211208.classTest;
class Problem5 {
    void TEST() {
        System.out.println("Test Version");
    }
    void TEST(int number) {
        System.out.println("Test Version: " + number);
    }
    void TEST(double number, String version) {
        System.out.println("Test Version: " + number + version);
    }
}
public class ClassTest5 {
    public static void main(String[] args) {
        Problem5 p = new Problem5();
        p.TEST();
        p.TEST(2);
        p.TEST(2.51, "beta");
    }
}
