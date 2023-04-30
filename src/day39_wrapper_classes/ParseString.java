package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println("total = " + total);
        System.out.println("count = " + count);

        int num = Integer.parseInt("55");

        String strPrice = "123.99";
        double price = Double.parseDouble(strPrice);
        if (price > 100) {
            System.out.println("expensive");
        }
        String sentence = "I wrote 857 lines of code";
        String[] sentence2 = sentence.split(" ");
        int linesOfCode = Integer.parseInt(sentence2[2]);
        System.out.println("linesOfCode = " + linesOfCode);
    }
}
