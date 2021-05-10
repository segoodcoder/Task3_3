package logic;


import java.util.LinkedList;

public class MarketPlace {
    private static LinkedList<Car> listOfCars = new LinkedList<Car>();
    private static MarketPlace INSTANCE;

    public static MarketPlace getInstance() {
        if ( INSTANCE == null) {
            INSTANCE = new MarketPlace();
        }
        return INSTANCE;
    }

    public static LinkedList<Car> getListOfCars() {
        return listOfCars;
    }



    public static void addNewAd (Car car) {
        listOfCars.add(car);
    }

    public static void setListOfCars(LinkedList<Car> listOfCars) {
        MarketPlace.listOfCars = listOfCars;
    }

    private MarketPlace()
    {

    }

}
