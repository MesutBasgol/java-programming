package day32_arrays_split;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String reversed = "";
        String[] reverseSentence = sentence.split(" ");
        for (int i=reverseSentence.length-1 ; i>=0; i--){
            reversed += reverseSentence[i]+" ";
            //System.out.print(reverseSentence[i] + " ");
        }
        System.out.println("sentence = " + sentence);
        System.out.println("reversed = " + reversed);
        //System.out.println(reverseSentence[2] + " " + reverseSentence[1] + " " + reverseSentence[0]);
    }
}
