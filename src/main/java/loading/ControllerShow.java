package loading;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ScrollPane;
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
    VBox vb;
    @FXML
    HBox hb;

    public void initialize() {
       LinkedList<Car> ll = MarketPlace.getListOfCars();
       int size = ll.size();
       ArrayList<HBox> listOfH = new ArrayList<>();
       for (int i = 0; i < size; i ++) {
           HBox hb = new HBox();
           listOfH.add(hb);
       }
       for (int i = 0; i < size; i ++) {
           vb.getChildren().add((Node) listOfH.get(i));
       }
       sp.setContent(vb);
       System.out.println(size);
    }

}
