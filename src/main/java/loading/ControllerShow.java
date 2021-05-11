package loading;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import logic.Car;
import logic.MarketPlace;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

import static javafx.scene.paint.Color.RED;

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
    ImageView ig;

    @FXML
    private Button back;

    public void initialize() throws MalformedURLException {
        final VBox fp = new VBox();
        LinkedList<Car> ll = myMP.getListOfCars();
        for (Car car: ll) {
            hbl = new HBox();
            File file = new File(car.getPath());
            String localUrl = file.toURI().toURL().toString();
            Image image = new Image(localUrl);
            ig = new ImageView(image);
            ig.setFitHeight(100);
            ig.setFitWidth(200);
            brand = new Label(car.getBrand() + " ");
            brand.setFont(Font.font("Arial", FontWeight.BOLD, 12));
            model = new Label(car.getModel() + " ");
            model.setFont(Font.font("Arial", FontWeight.BOLD, 12));
            year = new Label(car.getYear() + " год ");
            year.setFont(Font.font("Arial",12));
            phone = new Label(" Телефон: " + car.getPhone() + " ");
            phone.setFont(Font.font("Arial",12));
            mileage = new Label(car.getMileage() + " км ");
            mileage.setFont(Font.font("Arial", 12));
            price = new Label("Цена: " + car.getPrice() + " руб");
            price.setFont(Font.font("Arial", FontWeight.BOLD, 12));
            price.setTextFill(RED);
            hbl.getChildren().addAll(brand, model, year, phone, mileage, price, ig);
            fp.getChildren().add(hbl);

        }
        sp.setContent(fp);
        sp.setPannable(true);
    }

    public void goBack() throws IOException {
        Stage sc = (Stage) back.getScene().getWindow();
        sc.close();
        MainWindow mw = new MainWindow();
        mw.start(new Stage());
    }
}
