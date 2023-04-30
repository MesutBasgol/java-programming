package day46_encapsulation;

public class Car {
    private String model;
    private int year;
    private int mileage;

    //setter method for the model
    public void setModel(String carModel) {
        model = carModel;
    }
    //getter method for the model
    public String getModel () {
        return model;
    }
    public void setYear(int carYear) {
        year = carYear;
    }
    public int getYear() {
        return year;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    public int getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
