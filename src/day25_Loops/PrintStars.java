package day25_Loops;

public class PrintStars {
    public static void main(String[] args) {
        for (int i=1; i<=15; i++){
            System.out.print("* ");
        }
        System.out.println();
        String myStars = "";
        for (int i=1; i<=5; i++){
            myStars += "* ";
            System.out.println(myStars);
        }
        System.out.println("my stars = " + myStars.trim());
        int sum= 0;
        for (int i=1; i<=10; i++){
            sum+=i;
        }
        System.out.println("sum of 1 to 10= "+sum);
    }
}
