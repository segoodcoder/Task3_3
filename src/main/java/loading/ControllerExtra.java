package loading;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ControllerExtra {
    @FXML
    static TextArea ta;
    @FXML
    Button add;
    @FXML
    Button close;

    public static String setExtraInfo(){
        return ta.getText();
    }



}
