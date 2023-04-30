package day44_custom_class;

public class MyApps {
    public static void main(String[] args) {
        App app1 = new App();
        app1.name = "linkedin";
        app1.version = 12.01;
        app1.open();
        if (app1.name.equals("linkedin")){
            System.out.println("It is correct app");
        }
    }
}
