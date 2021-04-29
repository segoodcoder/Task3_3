package loading;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class MainWindow extends Application {

    public static void main(String[] args) {
        MainWindow.launch();
    }

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader loader = new FXMLLoader();
        URL url = getClass().getResource("/mainWindow.fxml");
        loader.setLocation(url);
        Pane root = loader.load();

        Hyperlink vk = new Hyperlink("Created by Georgy");
        vk.setLayoutX(46);
        vk.setLayoutY(350);
        vk.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                getHostServices().showDocument("https://vk.com/neweratoday");
            }
        });

        root.getChildren().addAll(vk);

        Scene mainScene = new Scene(root);

        stage.setScene(mainScene);
        stage.show();
    }

}

