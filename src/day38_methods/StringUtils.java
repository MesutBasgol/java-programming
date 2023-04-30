package day38_methods;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(isNullOrEmpty("none"));
        String word = null;
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
        word = "";
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
    }
    public static boolean isNullOrEmpty (String str) {
        return (str == null || str.isEmpty());
//        if (str == null || str.isEmpty()){
//            return true;
//        } else {
//            return false;
//        }
    }
}
