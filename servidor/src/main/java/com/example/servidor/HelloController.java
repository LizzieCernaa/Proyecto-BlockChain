package com.example.servidor;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
 private Cifrado oCifradro;

    @FXML
    private void initialize() {
       this.oCifradro= new Cifrado("NADA123456668");
       String NodeData;
       String pnodeData;
       this.currentNode= pnodeData;
       this.startServer();
       this.startServer();

       t

    }
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