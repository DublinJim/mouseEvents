package com.example.mouseevents;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private Text txt1;

    @FXML
    void hideText() {
        txt1.setText("Hide me");
        txt1.setVisible(false);
    }

    @FXML
    void showText() {
        txt1.setText("Returned");
        txt1.setVisible(true);
    }


}
