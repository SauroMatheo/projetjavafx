module fr.dampierre {
    requires javafx.controls;
    requires javafx.fxml;

    opens fr.dampierre to javafx.fxml;
    exports fr.dampierre;
}
