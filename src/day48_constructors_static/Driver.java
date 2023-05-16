package day48_constructors_static;

import com.sun.xml.internal.ws.api.pipe.Engine;

public class Driver {
    private String name;

    public Driver() {
    }

    public Driver(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driver='" + name + '\'' +
                '}';
    }

    public String getDriver() {
        return name;
    }

    public void setDriver(String name) {
        this.name = name;
    }
}
