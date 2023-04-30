package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        acc.setAccountNumber(432154685689L);
        acc.setBalance(250.50);
        acc.setAccountHolder("Mike Smith");
        acc.setType("360 Checking");
        System.out.println(acc);

        CheckingAccount acc1 = new CheckingAccount();
        acc1.setAccountInfo(125456895623L, "Mesut BASGOL", 15250, "Checking");
        System.out.println(acc1);
    }
}
