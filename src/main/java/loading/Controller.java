package loading;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Controller {

    public void button1Clicked() throws IOException {
        MainWindow addCarWindow = new MainWindow();
        addCarWindow.startAddCarWindow(new Stage());
    }
}
