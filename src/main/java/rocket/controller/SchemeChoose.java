package rocket.controller;

import javafx.fxml.FXML;
import rocket.Main;

public class SchemeChoose {

    @FXML
    private void previous(){
        Main.gotoHelloWindow();
    }

    @FXML
    private void next(){
        Main.gotoComputeMass();
    }
}
