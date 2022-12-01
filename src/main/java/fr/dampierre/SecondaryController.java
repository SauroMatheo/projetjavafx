package fr.dampierre;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public class SecondaryController {
    @FXML
    private Button btnTest;

    @FXML
    private Button secondaryButton;

    @FXML
    void actionTest(ActionEvent event) {
        Color color = Color.RED;
        btnTest.setTextFill(color);

        secondaryButton.setText("COUCOU !");
        secondaryButton.setOnAction(null);
    }

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}