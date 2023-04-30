package day34_void_methods;

public class StartCar {
    public static void main(String[] args) {
    seatInCar();
    startTheCar();
    shiftToDrive();
    pressGasPedal();

    }
    public static void pressGasPedal(){
        System.out.println("4-Hold steering wheel with 2 hands and pres gas pedal");
    }
    public static void seatInCar(){
        System.out.println("1-Open the door and sit in driver seat");
    }
    public static void startTheCar(){
        System.out.println("2-Insert key to ignition and turn the key clockwise");
    }
    public static void shiftToDrive(){
        System.out.println("3-Press break pedal and shift to 'D");
    }
}
