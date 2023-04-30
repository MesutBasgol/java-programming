package day24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) {
        int count = 5;
        while (count >= 0) {
            System.out.println("count = " + count);
            count--;
        }
        System.out.println("Finished the count");

        int unreadSMS = 10;
        System.out.println("I have total " + unreadSMS + " unread SMS.");
        while (unreadSMS > 0){
            System.out.println("Reading SMS:" + unreadSMS);
            unreadSMS--;
        }
        System.out.println("All messages are read.");
    }
}
