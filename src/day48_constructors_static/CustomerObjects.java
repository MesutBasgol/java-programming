package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customers cs1 = new Customers();
        System.out.println(cs1.toString());
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);
        Customers cs2 = new Customers("Mike",2);
        Customers cs3 = new Customers("John Ward",4873);
        System.out.println(cs2);
        System.out.println(cs3);
        //array of customers
        Customers[] todaysCustomers = {cs1, cs2, cs3, new Customers("Bashir", 449)};
        //arraylist of customers
        List<Customers> customersList = new ArrayList<>();
        customersList.add(cs1);
        customersList.add(cs2);
        customersList.add(cs3);
        customersList.add(new Customers("Bashir", 449));

        //Print info of first customer object in array and arraylist
        System.out.println(todaysCustomers[0].toString());
        System.out.println(customersList.get(1).toString());
        System.out.println(customersList);

        System.out.println("----- FOR LOOP ----");
        for (int i = 0; i < customersList.size(); i++) {
            System.out.println(customersList.get(i));
        }
        System.out.println("---- FOR EACH LOOP ----");
        for (Customers eachCustomer: customersList) {
            System.out.println(eachCustomer);
        }
        System.out.println("---- NAMES OF ALL CUSTOMERS ----");
        //customersList.forEach(each -> System.out.println(each.getName()));
        for (int i = 0; i < customersList.size(); i++) {
            System.out.println(customersList.get(i).getName());
        }
    }
}
