/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.com.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author eopit
 */
public class TelaCalcController implements Initializable {

    @FXML
    private Label screen;

    private double numVisor, primeiroNumero, segundoNumero;
    private String numVisorString, operador;
    @FXML
    private Button botaoSoma;
    @FXML
    private Button botaoMenos;
    @FXML
    private Button botaoDivisao;
    @FXML
    private Button botaoMultiplicacao;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        numVisorString = "";
    }

    @FXML
    private void nb7(ActionEvent event) {
        numVisorString += 7;
        screen.setText(numVisorString);
    }

    @FXML
    private void nb8(ActionEvent event) {
        numVisorString += 8;
        screen.setText(numVisorString);
    }

    @FXML
    private void nb9(ActionEvent event) {
        numVisorString += 9;
        screen.setText(numVisorString);
    }

    @FXML
    private void nb6(ActionEvent event) {
        numVisorString += 6;
        screen.setText(numVisorString);
    }

    @FXML
    private void nb5(ActionEvent event) {
        numVisorString += 5;
        screen.setText(numVisorString);
    }

    @FXML
    private void nb4(ActionEvent event) {
        numVisorString += 4;
        screen.setText(numVisorString);
    }

    @FXML
    private void nb1(ActionEvent event) {
        numVisorString += 1;
        screen.setText(numVisorString);
    }

    @FXML
    private void nb2(ActionEvent event) {
        numVisorString += 2;
        screen.setText(numVisorString);
    }

    @FXML
    private void nb3(ActionEvent event) {
        numVisorString += 3;
        screen.setText(numVisorString);
    }

    @FXML
    private void nb0(ActionEvent event) {
        numVisorString += 0;
        screen.setText(numVisorString);
    }

    @FXML
    private void btResultado(ActionEvent event) {
        segundoNumero = Double.valueOf(screen.getText());
        //fazer conta das operacoes aqui embaixo

        switch (operador) {
            case "soma":
                numVisor = primeiroNumero + segundoNumero;
                screen.setText(String.valueOf(numVisor));
                screen.setStyle("-fx-text-fill: #FFFFFF");
                botaoSoma.setStyle("-fx-text-fill: #FFFFFF");
                botaoSoma.setStyle("-fx-background-color: #1F1F1F");

                break;
            case "menos":
                numVisor = primeiroNumero - segundoNumero;
                screen.setText(String.valueOf(numVisor));
                screen.setStyle("-fx-text-fill: #FFFFFF");
                botaoMenos.setStyle("-fx-text-fill: #FFFFFF");
                botaoMenos.setStyle("-fx-background-color: #1F1F1F");
                break;
            case "divisao":
                numVisor = primeiroNumero / segundoNumero;
                screen.setText(String.valueOf(numVisor));
                screen.setStyle("-fx-text-fill: #FFFFFF");
                botaoDivisao.setStyle("-fx-text-fill: #FFFFFF");
                botaoDivisao.setStyle("-fx-background-color: #1F1F1F");
                break;
            case "multiplicacao":
                numVisor = primeiroNumero * segundoNumero;
                screen.setText(String.valueOf(numVisor));
                screen.setStyle("-fx-text-fill: #FFFFFF");
                botaoMultiplicacao.setStyle("-fx-text-fill: #FFFFFF");
                botaoMultiplicacao.setStyle("-fx-background-color: #1F1F1F");
                break;
            default:
                screen.setText("ERROR");
                screen.setStyle("-fx-text-fill: #EE5253");
                break;
        }
    }

    @FXML
    private void btLimpar(ActionEvent event) {
        numVisorString = "";
        screen.setText(numVisorString);
        primeiroNumero = 0;
        segundoNumero = 0;
        operador = "";
        numVisor = 0;
    }

    @FXML
    private void btSoma(ActionEvent event) {
        primeiroNumero = Double.valueOf(screen.getText());
        screen.setText(""); 
        numVisorString = "";
        operador = "soma";
        botaoSoma.setStyle("-fx-text-fill: #EE5253");
        botaoSoma.setStyle("-fx-background-color: #FFFFFF");
    }

    @FXML
    private void btMenos(ActionEvent event) {
        primeiroNumero = Double.valueOf(screen.getText());
        screen.setText("");
        numVisorString = "";
        operador = "menos";
        botaoMenos.setStyle("-fx-text-fill: #EE5253");
        botaoMenos.setStyle("-fx-background-color: #FFFFFF");
    }

    @FXML
    private void btDivisao(ActionEvent event) {
        primeiroNumero = Double.valueOf(screen.getText());
        screen.setText("");
        numVisorString = "";
        operador = "divisao";
        botaoDivisao.setStyle("-fx-text-fill: #EE5253");
        botaoDivisao.setStyle("-fx-background-color: #FFFFFF");
    }

    @FXML
    private void btMultiplicacao(ActionEvent event) {
        primeiroNumero = Double.valueOf(screen.getText());
        screen.setText("");
        numVisorString = "";
        operador = "multiplicacao";
        botaoMultiplicacao.setStyle("-fx-text-fill: #EE5253");
        botaoMultiplicacao.setStyle("-fx-background-color: #FFFFFF");
    }
}
