package day27_loops;

public class Neighbors {
    public static void main(String[] args) {
        String word = "jaavvaa";
        for (int i = 0; i < word.length()-1; i++) {
            if (word.charAt(i) == word.charAt(i+1)){
                System.out.println("beep - " + word.charAt(i));
            }

        }
    }
}
