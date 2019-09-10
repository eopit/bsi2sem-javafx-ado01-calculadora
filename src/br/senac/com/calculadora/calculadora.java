package br.senac.com.calculadora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class calculadora extends Application {
    public void start(Stage stage) throws Exception {
        Parent calc = FXMLLoader.load(getClass().getResource("/br/senac/com/gui/telaCalc.fxml"));
        
        Scene scene = new Scene(calc);
        
        stage.setScene(scene);
        stage.setTitle("Calculadora");
        stage.show();
    }
}
