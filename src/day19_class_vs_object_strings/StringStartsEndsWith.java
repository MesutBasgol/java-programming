package day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("i")); // true
        System.out.println(word.startsWith("in")); // true
        System.out.println(word.startsWith("intellij")); // true
        System.out.println(word.startsWith("intellij idea")); // true
        System.out.println("java".startsWith("j")); // true
        System.out.println(word.startsWith("Int")); // false case sensitive
        System.out.println(word.endsWith("idea")); // true
        System.out.println(word.endsWith("a")); // true
        System.out.println(word.endsWith("intellij idea")); // true

        String name = "Mr. Nadir";
        if (name.startsWith("Mr.")){
            System.out.println("Man");
        } else if (name.startsWith("Dr.")) {
            System.out.println("Doctor");
        } else if (name.startsWith("Mrs.")) {
            System.out.println("Woman");
        } else if (name.startsWith("Ms.")) {
            System.out.println("Single Woman");
        } else if (name.startsWith("Sr.")) {
            System.out.println("Senior");
        }else {
            System.out.println("Normal Name");
        }

        String url = "https://www.rambler.ru";
        if (url.endsWith(".com")){
            System.out.println("Commercial website");
        } else if (url.endsWith(".ru")) {
            System.out.println("Russian website");
        } else if (url.endsWith(".gov")) {
            System.out.println("Government website");
        } else if (url.endsWith(".edu")) {
            System.out.println("Education website");
        } else if (url.endsWith(".org")) {
            System.out.println("Organization website");
        } else if (url.endsWith(".tr")) {
            System.out.println("Turkish website");
        }
    }
}
