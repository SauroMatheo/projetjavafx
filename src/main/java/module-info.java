module fr.dampierre {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens fr.dampierre to javafx.fxml;

    exports fr.dampierre;
}
