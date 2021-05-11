package loading;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import logic.Car;
import logic.MarketPlace;

import java.io.IOException;
import java.net.URL;

import static javafx.scene.paint.Color.GREEN;
import static javafx.scene.paint.Color.RED;

public class ControllerAdd {

    public Button buttonAddPicture;
    public Button buttonAdd;
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
    private Label label;
    @FXML
    private TextField ig;
    @FXML
    private Button close;

    @FXML
    public void closeWindowAdd (ActionEvent event) throws IOException {
        Stage stage = (Stage) close.getScene().getWindow();
        stage.close();
        MainWindow mw = new MainWindow();
        mw.start(new Stage());
    }

    @FXML
    void newAuto(ActionEvent event) {

    }

    @FXML
    protected void initialize() {
        brand.setEditable(true);
        brand.getItems().addAll("Марка", "Audi", "BMW", "Mercedes", "Toyota", "Volkswagen", "Volvo");
        brand.setValue("Марка");
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

    public void addNewCar() throws NullPointerException{
        try {
            String brandOfCar = brand.getValue();
            String modelOfCar = fieldModel.getText();
            String yearOfCar = fieldYear.getText();
            String phoneOfOwner = fieldPhone.getText();
            String mileageOfCar = fieldMileage.getText();
            String priceOfCar = fieldPrice.getText();
            String pathToPhoto = ig.getText();

            Car myCar = new Car(brandOfCar, modelOfCar, yearOfCar, phoneOfOwner, mileageOfCar, priceOfCar, pathToPhoto);
            if (!brandOfCar.equals("") && !modelOfCar.equals("") && !yearOfCar.equals("") && !phoneOfOwner.equals("") &&
            !mileageOfCar.equals("") && !priceOfCar.equals("")) {
                myMP.addNewAd(myCar);
                brand.setValue("Марка");
                fieldModel.clear();
                fieldYear.clear();
                fieldPhone.clear();
                fieldMileage.clear();
                fieldPrice.clear();
                ig.clear();
                label.setText("Объявление успешно добавлено!");
                label.setTextFill(GREEN);
            }
            else {
                label.setText("Заполните обязательные поля!");
                label.setTextFill(RED);
            }



        }
        catch (NullPointerException n) {
            System.out.println("Заполните обязательные поля");
        }
    }
}
