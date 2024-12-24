package org.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.demo.util.Alerts;
import org.example.demo.util.Constraints;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private TextField txtNumero1;

    @FXML
    private TextField txtNumero2;

    @FXML
    private Label labelResultado;

    @FXML
    private Button btSoma;

    @FXML
    public void onBtSomaAction() {
        try {
            Locale.setDefault(Locale.US);
            double numero1 = Double.parseDouble(txtNumero1.getText());
            double numero2 = Double.parseDouble(txtNumero2.getText());
            double soma = numero1 + numero2;
            labelResultado.setText(String.format("%.2f", soma));
        }
        catch (NumberFormatException e){
            Alerts.showAlerts("Erro", null, e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Constraints.setTextFieldDouble(txtNumero1);
        Constraints.setTextFieldDouble(txtNumero2);
    }
}