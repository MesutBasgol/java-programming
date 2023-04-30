package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        List<String> myCars = new ArrayList<>();
        myCars.add("Totoya");
        myCars.add("Mazda");
        myCars.add("Ford");
        myCars.add("Moskvich");
        myCars.add("Tesla");
        myCars.add(0, "Jeep");
        myCars.add(1, "Lada");
        myCars.add(2, "Yugo");

        System.out.println(myCars);
        String allCarsIn1St = myCars.toString();
        System.out.println(allCarsIn1St);

        myCars.set(0, "Lamborghini");
        System.out.println("after set = " + myCars);

        myCars.set(4, "Honda");
        System.out.println("after set = " + myCars);

        int indexOf = myCars.indexOf("Ford");
        myCars.set(indexOf, "BMW");

        myCars.set(myCars.indexOf("Moskvich"), "Mercedes");
        System.out.println("set after ford and moskvich = " + myCars);


    }
}
