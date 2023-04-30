package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [Nadir] From Number <+1222-333-4444>" +
                " Message: {Hello, lets code some java}";

        System.out.println("Sender: " + message.substring(message.indexOf("[")+1 , message.indexOf("]")));
        System.out.println("Phone number: " + message.substring(message.indexOf("<")+1, message.indexOf(">")));
        System.out.println("Message: " + message.substring(message.indexOf("{")+1, message.indexOf("}")));

        String message2 ="is Mesut sick?";
        System.out.println(message2.substring(message2.indexOf(" ")+1,message2.lastIndexOf(" ")));

        String sender = "   Saim   ";
        if (sender.trim().equals("Saim")){
            System.out.println("Saim sent a quiz");
        }else {
            System.out.println("Someone else sent a message");
        }
        System.out.println(sender.trim());
    }
}
