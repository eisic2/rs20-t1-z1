package ba.unsa.etf.rs;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    public Button hello;
    public Label world;

    public void Submit(ActionEvent actionEvent) {
        world.setText("Hello World!");
    }
}
