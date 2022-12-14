package fr.dampierre;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * JavaFX App
 */
public class App extends Application {

    public static Connection connect() {
        String dbURL = "jdbc:mysql://localhost:3306/";
        String nomUtilisateur = "root";
        String mdp = "";

        try {
            // Connexion en passant les informations spécifiées précédemment
            Connection conn = DriverManager.getConnection(dbURL, nomUtilisateur, mdp);
            // Si on est bien connecté à la DB
            if (conn != null) {
                // On affiche un petit message sur le terminal
                System.out.println("Connexion réussie !");

                return conn;
            }
        } catch (SQLException ex) {
            // Code de traitement d'erreur
            ex.printStackTrace();
        }

        return null;
    }

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        connect();
        launch();
    }

}