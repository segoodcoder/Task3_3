package loading;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import logic.Car;
import logic.MarketPlace;

import java.io.IOException;
import java.net.URL;

public class ControllerAdd {

    MarketPlace myMP = MarketPlace.getInstance();
    @FXML
    private ComboBox<String> brand;
    @FXML
    private TextField fieldModel;
    @FXML
    private TextField fieldYear;
    @FXML
    private TextField fieldPhone;
    @FXML
    private TextField fieldMileage;
    @FXML
    private TextField fieldPrice;

    @FXML
    void addExtraInfo(ActionEvent event) {

    }

    @FXML
    void newAuto(ActionEvent event) {

    }

    @FXML
    protected void initialize() {
        brand.setEditable(true);
        brand.getItems().addAll("Audi", "BMW", "Mercedes");
    }



    public void addExtraInfo() throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        URL url = getClass().getResource("/extraInfo.fxml");
        loader.setLocation(url);
        Pane root = loader.load();

        Scene sc = new Scene(root);
        stage.setScene(sc);
        stage.show();
    }

    public void addNewCar(ActionEvent actionEvent) throws NullPointerException{
        try {
            String brandOfCar = brand.getValue();
            System.out.println(brand);
            String modelOfCar = fieldModel.getText();
            System.out.println(fieldModel);
            String yearOfCar = fieldYear.getText();
            System.out.println(fieldYear);
            String phoneOfOwner = fieldPhone.getText();
            System.out.println(fieldPhone);
            String mileageOfCar = fieldMileage.getText();
            System.out.println(fieldMileage);
            String priceOfCar = fieldPrice.getText();
            System.out.println(fieldPrice);
            Car myCar = new Car(brandOfCar, modelOfCar, yearOfCar, phoneOfOwner, mileageOfCar, priceOfCar);
            System.out.println(myCar);
            myMP.addNewAd(myCar);
            System.out.println(myMP);
        }
        catch (NullPointerException n) {
            System.out.println("Заполните обязательные поля");
        }
    }
}
