package day19_class_vs_object_strings;

public class StringCaseConversion {
    public static void main (String[] args){
        String word = "CyberTek";
        String sentence = "Java IS Fun!";
        System.out.println(word);
        System.out.println(sentence);
        System.out.println(word.toLowerCase());
        System.out.println(sentence.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println(sentence.toUpperCase());

        word = word.toLowerCase();
        System.out.println("word - " + word);
        sentence.toLowerCase(); // has no effect on the variable
        System.out.println("sentence = " + sentence);
        
        String company = "Amazon";
        System.out.println("company = " + company);
        System.out.println("company.toUpperCase() = " + company.toUpperCase());
        System.out.println("java".toUpperCase());
        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);
    }
}
