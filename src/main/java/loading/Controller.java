package loading;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Controller {

    @FXML
    public ComboBox<String> combobox1;

    @FXML
    public Button closeButton;

    @FXML
    public void handleCloseButtonAction() {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    public void startAddCarWindow() throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        URL url = getClass().getResource("/addCarWindow.fxml");
        loader.setLocation(url);
        Pane root = loader.load();

        combobox1 = new ComboBox<String>();
        combobox1.getItems().addAll("Audi", "BMW", "Mercedes", "Porsche", "Subaru", "Toyota", "Волга");
        combobox1.resize(247.0, 25.0);
        combobox1.relocate(32.0, 101.0);
        root.getChildren().add(combobox1);

        stage.setScene(new Scene(root));
        stage.show();
    }

    public void startListCarWindow() throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        URL url = getClass().getResource("/listCarWindow.fxml");
        loader.setLocation(url);
        Pane root = loader.load();

        Scene sc = new Scene(root);
        stage.setScene(sc);
        stage.show();
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

}

