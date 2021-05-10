package logic;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Car {

    private final String brand;
    private final String model;
    private final String year;
    private final String phone;
    private final String mileage;
    private final String price;
//    private final String extraInfo;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getPhone() {
        return phone;
    }

    public String getMileage() {
        return mileage;
    }

    public String getPrice(){
        return price;
    }

//    public String getExtraInfo() {
//        return extraInfo;
//    }
//
//    public Path path;

    public Car(String brand, String model, String year, String phone, String mileage, String price) { //String extraInfo, Path path
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.phone = phone;
        this.mileage = mileage;
        this.price = price;
//        this.extraInfo = extraInfo;
//        this.path = path;
    }

}
