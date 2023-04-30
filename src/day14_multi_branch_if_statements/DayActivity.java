package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "rainy";
        if (weather.equals("sunny")){
            System.out.println(weather + "-Go to park");
        } else if (weather.equals("rainy")) {
            System.out.println(weather + "-stay home, drink tea, code java");
        } else if (weather.equals("snowy")) {
            System.out.println(weather + "-build snowman");
        } else if (weather.equals("windy")) {
            System.out.println(weather + "-fly a kite");
        }else {
            System.out.println("code java");
        }
    }
}
