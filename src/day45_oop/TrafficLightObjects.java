package day45_oop;

public class TrafficLightObjects {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();
        //light.color = "red";
        light.changeColor("red");
        light.showColor();

        light.changeColor("green");
        light.showColor();

        TrafficLight light1 = new TrafficLight();
        light1.changeColor("black");
        light1.showColor();
    }
}
