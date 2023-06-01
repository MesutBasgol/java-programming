package day50_inheritance;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlockDemo st1 = new StaticBlockDemo();
        StaticBlockDemo st2 = new StaticBlockDemo(); // NOT RUNS BECAUSE OF THE FIRST COMMENT
        StaticBlockDemo st3 = new StaticBlockDemo();
        System.out.println("StaticBlockDemo.num = " + StaticBlockDemo.num);
    }
}
