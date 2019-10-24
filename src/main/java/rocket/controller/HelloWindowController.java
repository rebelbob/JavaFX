package rocket.controller;

import javafx.fxml.FXML;
import rocket.Main;

public class HelloWindowController {

    @FXML
    private void start(){
        Main.gotoSchemeChoose();
    }
}
