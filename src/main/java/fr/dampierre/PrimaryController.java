package fr.dampierre;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML
    private TextField txtPivot;

    @FXML
    void btnPivoterClick(ActionEvent event) {
        String rotationString = txtPivot.getText(); // récupère le contenu du TextField
        int rotation = Integer.parseInt(rotationString); // transforme le texte récupéré en valeur entière
        txtPivot.setRotate(rotation); // fait pivoter le TextField
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
