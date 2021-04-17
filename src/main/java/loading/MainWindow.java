package loading;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class MainWindow extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader loader = new FXMLLoader();
        URL url = getClass().getResource("/mainWindow.fxml");
        loader.setLocation(url);
        Pane root = loader.load();

        stage.setScene(new Scene(root));
        stage.show();
    }

    public void startAddCarWindow(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        URL url = getClass().getResource("/addCarWindow.fxml");
        loader.setLocation(url);
        Pane root = loader.load();

        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void main(String[] args) {
        MainWindow.launch();
    }

}