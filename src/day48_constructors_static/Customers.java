package day48_constructors_static;

public class Customers {
    private String name;
    private int id;
//No-Args Constructor
    public Customers() {
        System.out.println("No-args Constructor");
        name = "new customer";
        id = -1;
    }
    //add a constructor where we can assign name and id
    public Customers(String name, int id) {
        System.out.println("2-args constructor");
        this.name = name; //setName(name);
        this.id = id; //setId(id); when we have any condition in the setter
    }
    @Override
    public String toString() {
        return "Customers{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
