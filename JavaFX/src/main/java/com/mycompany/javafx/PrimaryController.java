package com.mycompany.javafx;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField result;
    double x = 0;
    double y = 0;
    String op = "";
    @FXML
    private TextField operation;

    @FXML
    private void handle(ActionEvent event) {
        String currentBtnLabel = ((Button) event.getSource()).getText();

        switch (currentBtnLabel) {
            case "+":
                x = Integer.parseInt(result.getText());
                op = "+";
                result.clear();
                break;
            case "-":
                x = Integer.parseInt(result.getText());
                op = "-";
                result.clear();
                break;
            case "X":
                x = Integer.parseInt(result.getText());
                op = "X";
                result.clear();
                break;
            case "/":
                x = Double.parseDouble(result.getText());
                op = "/";
                result.clear();
                break;
            case "C":
                result.clear();
                operation.clear();
                break;
            case "=":
                y = Integer.parseInt(result.getText());
                switch (op) {
                    case "+":
                        operation.setText(String.valueOf((int)x +(int) y));
                        break;
                    case "-":
                        operation.setText(String.valueOf((int)x - (int)y));
                        break;
                    case "/":
                        operation.setText(String.valueOf((double) x / (double) y));
                        break;
                    case "X":
                        operation.setText(String.valueOf((int)x *(int) y));
                        break;
                    default:
                        operation.clear();
                        break;
                }
                x = 0;
                y = 0;
                op = "";
                result.clear();
                break;

            default:
                result.appendText(currentBtnLabel);
                break;
        }
    }
}
