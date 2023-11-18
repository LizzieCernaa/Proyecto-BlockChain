package com.example.servidor;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        var conn = new DbConnection();
        if (conn.Conectar()){
            welcomeText.setText("conectado!");
        }
        else {
            welcomeText.setText("ERROR!" + conn.getError());
        }
    }
}