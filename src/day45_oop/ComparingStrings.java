package day45_oop;

public class ComparingStrings {
    public static void main(String[] args) {
        String word1 = "java"; //create in string pool
        String word2 = "java"; //re-use from string pool
        String word3 = new String("java"); //create NEW object in HEAP, outside String pool
        String word4 = new String("java"); //create NEW object in HEAP, outside String pool
        System.out.println(word1 == word2); //TRUE - point to same object in pool
        System.out.println(word1 == word3); //FALSE - point to different object in HEAP and POOL
        System.out.println(word3 == word4); //FALSE
        // == never compares values, only if pointing the same
        System.out.println(word1.equals(word2));// True - comparing values
        System.out.println(word1.equals(word3));// True - comparing values
        System.out.println(word3.equals(word4));// True - comparing values
    }
}
