package day45_oop;

public class TrafficLight {
    String color;

    public void showColor() {
        System.out.println("Current traffic color is " + color);
    }
    public void changeColor(String newColor) {
        if (newColor.equalsIgnoreCase("red") || newColor.equalsIgnoreCase("green") || newColor.equalsIgnoreCase("yellow")) {
            System.out.println("changing color to " + newColor);
            color = newColor;
        }else {
            System.out.println("ERROR! Invalid Color = " + newColor);
        }
    }
}
