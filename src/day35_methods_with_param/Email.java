package day35_methods_with_param;

public class Email {
    public static void main(String[] args) {
    buildEmail("basgol","Gmail");
    buildEmail("Mesut Basgol", "Hotmail");
        System.out.println(getCreditScore());
        System.out.println("Score = " + getCreditScore());
        int score = getCreditScore();
        System.out.println("score = " + score);
    }
    public static void buildEmail (String name, String domain){
//        if (name.contains(" ")){
//            System.out.println(name.replace(" ", "_").toLowerCase() + "@" + domain.toLowerCase() + ".com");
//        }else
//        System.out.println(name.toLowerCase() + "@" + domain.toLowerCase() + ".com");
        name = name.replace(" ","_").toLowerCase();
        domain = domain.toLowerCase();
        System.out.println(name + "@" + domain + ".com");
    }
    public static int getCreditScore(){
        return 800;
    }
}
