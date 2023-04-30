package day23_string_manipulation_while_loop;

public class FirstLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i<=10){
            System.out.println(i);
            i += 1; // i++ is also possible
        }
        int apples = 0;
        while (apples<=3){
            System.out.println("apples = " + apples);
            apples++;
        }
        System.out.println("apples = " + apples);
    }
}
