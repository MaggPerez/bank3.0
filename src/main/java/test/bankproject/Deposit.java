/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.bankproject;

/**
 *
 * @author maggy
 */
import javafx.scene.control.Label;
import javafx.fxml.FXML;

/**
 *
 * @author maggy
 */
public class Deposit {
    @FXML
    Label nameLabel;
    
    public void displayValue(String values){
        nameLabel.setText(values);
    }
}
