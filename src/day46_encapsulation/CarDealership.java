package day46_encapsulation;

public class CarDealership {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Nissan Altima");
        System.out.println("car1.getModel() = " + car1.getModel());
        car1.setYear(2020);
        System.out.println("car1.getYear() = " + car1.getYear());
        car1.setMileage(45230);
        System.out.println("car1.getMileage() = " + car1.getMileage());
        System.out.println(car1.toString());
        //System.out.println(car1); does the same thing above
    }
}
