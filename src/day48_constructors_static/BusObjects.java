package day48_constructors_static;

public class BusObjects {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.driver = new Driver("Ahmet");
        bus.engine = new Engine(10);
        System.out.println(bus.toString());

        Bus metroBus = new Bus();
        metroBus.driver = new Driver("Emrah");
        metroBus.engine = new Engine(20);
        System.out.println(metroBus);

        System.out.println(metroBus.driver.getDriver());

    }
}
