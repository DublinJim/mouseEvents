package com.example.mouseevents;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private Text txt1;

    @FXML
    void hideText(MouseEvent event) {
        txt1.setVisible(false);
    }

}
