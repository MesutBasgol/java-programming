package day44_custom_class;

public class Animal {
    String type = "some animal";
    public void eat() {
        System.out.println(type + " eats meat");
    }
    public void eat(String food) {
        System.out.println("eating " + food);
    }
    public void speak() {
        System.out.println("speaking");
    }
}
class AnimalObjects {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.type);
        animal.eat();
        animal.eat("grass");
        animal.speak();

        Animal cheetahObj = new Animal();
        cheetahObj.type ="Cheetah";
        System.out.println(cheetahObj.type);
        cheetahObj.eat("meat");
    }
}
