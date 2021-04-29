package logic;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Car {

    private final String brand;
    private final String model;
    private final int year;
    private final int phone;
    private final int mileage;
    private final String extraInfo;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPhone() {
        return phone;
    }

    public int getMileage() {
        return mileage;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public Path path;

    public Car(String brand, String model, int year, int phone, int mileage, String extraInfo, Path path) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.phone = phone;
        this.mileage = mileage;
        this.extraInfo = extraInfo;
        this.path = path;
    }

}
