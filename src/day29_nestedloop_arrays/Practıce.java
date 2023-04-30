package day29_nestedloop_arrays;

public class Practıce {
    public static void main(String[] args) {

    String str = "Helloeooo";
    
    int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
                //System.out.println("True");;
            }
            }
        if (count >= 3) {
            System.out.println(str + " has more than 3 'e'");
        }else{
            System.out.println("true");
        }
        }
    }
