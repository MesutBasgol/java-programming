package day10_shorthand_operators;

public class ShorthandOperators {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println("num1= "+ num1);
        num1 = num1 +1;
        System.out.println("num1= "+ num1);
        num1 += 1;
        System.out.println("num1= "+ num1);
        num1++;
        System.out.println("num1= "+ num1);
        ++num1;
        System.out.println("num1= "+ num1);
        // all above produce the same result and add 1 to the variable
        // all herebelow produce the same result and decrease 1 from the variable
        num1 = num1 - 1;
        System.out.println("num1= "+ num1);
        num1 -= 1;
        System.out.println("num1= "+ num1);
        num1--;
        System.out.println("num1= "+ num1);
        --num1;
        System.out.println("num1= "+ num1);
        char letter = 'A';
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        ++letter;
        System.out.println("letter = " + letter);
        letter--;
        System.out.println("letter = " + letter);

        char letter2 = 65;
        System.out.println("letter = " + letter2);
        letter2++;
        System.out.println("letter = " + letter2);


    }
}
