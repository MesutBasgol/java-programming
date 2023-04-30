package day29_nestedloop_arrays;

public class CountCharsNestedLoop {
    public static void main(String[] args) {
        String word = "hellohwwworrld";
        String check ="";
        for (int outer = 0; outer < word.length(); outer++) {
            char outerChar = word.charAt(outer);
            if (check.contains(outerChar+"")){
                continue;
            }else {
                check += outerChar;
                int count = 0;
                for (int inner = 0; inner < word.length(); inner++) {
                    char innerChar = word.charAt(inner);
                    if (innerChar == outerChar) {
                        count++;
                    }
                }
                System.out.println(outerChar + " = " + count);

            }

            }
        System.out.println("Unique characters in " + word + " are " + check);
    }
}
