package loading;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import logic.Car;
import logic.MarketPlace;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class ControllerShow {
    @FXML
    ScrollPane sp;
    @FXML
    HBox hbl;
    @FXML
    Label brand;
    @FXML
    Label model;
    Label year;
    Label phone;
    Label mileage;
    Label price;
    MarketPlace myMP = MarketPlace.getInstance();

    public void initialize() {
        final VBox fp = new VBox();
        LinkedList<Car> ll = myMP.getListOfCars();
        for (Car car: ll) {
            hbl = new HBox();
            brand = new Label(car.getBrand() + " ");
            model = new Label(car.getModel() + " ");
            year = new Label(car.getYear() + " год ");
            phone = new Label(" Телефон: " + car.getPhone() + " ");
            mileage = new Label(car.getMileage() + " км ");
            price = new Label("Цена: " + car.getPrice() + " руб");
            hbl.getChildren().addAll(brand, model, year, phone, mileage, price);
            fp.getChildren().add(hbl);

        }
        sp.setContent(fp);
        sp.setPannable(true);
    }

}
