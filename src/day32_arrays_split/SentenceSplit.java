package day32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] words = sentence.split(" ");
        System.out.println("1st Word: " + words[0]);
        System.out.println("2nd Word: " + words[1]);
        System.out.println("3rd Word: " + words[2]);

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[] googleWords = googleResult.split(" ");
        System.out.println("Count = " + googleWords[1]);
        //System.out.println("Result: " + googleResult.split(" ")[1]);
        System.out.println("Seconds = " + googleWords[3].replace("("," "));
        System.out.println("Seconds = " + googleWords[3].substring(1));



    }
}
