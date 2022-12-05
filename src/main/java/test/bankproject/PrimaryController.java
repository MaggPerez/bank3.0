package test.bankproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author maggy
 */
public class PrimaryController {
    @FXML
    public void login(ActionEvent event) throws Exception {
        // TODO

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Checking_and_Saving.fxml"));
        
        App.setRoot("checking_and_saving");
       // loginMsg.setText("Welcome");
        
    }    
    
    @FXML
    public void CheckingSaving(ActionEvent event) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Checking_and_Saving.fxml"));
        
        App.setRoot("checking_and_saving");
    }
    
    @FXML
    public void MainMenu(ActionEvent event) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
        
        App.setRoot("mainmenu");
    }

    @FXML
    public void deposit(ActionEvent event) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Deposit.fxml"));
        
        App.setRoot("deposit");
    }
    
    
    
    public void withdraw(ActionEvent event) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Withdraw.fxml"));
        
        App.setRoot("withdraw");
    }

    
    public void TransLog(ActionEvent event) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TransactionLog.fxml"));
        
        App.setRoot("transactionlog");
    }
    
    @FXML
    public void ExitMenu(ActionEvent event) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
        
        App.setRoot("mainmenu");
    }
    
//        @FXML
        private Stage stage;
        private Scene scene;
        private Parent root;
        
        @FXML
        TextField nameTextField;
        TextField totalField = new TextField();
     
     
     @FXML
    public void depositAmount(ActionEvent event) throws Exception{
       
//
////        root = FXMLLoader.load(getClass().getResource("Deposit.fxml"));
        
        
        String userInput = nameTextField.getText();
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Deposit.fxml"));
        root = loader.load();
        
        Deposit deposit = loader.getController();
        deposit.displayValue(userInput);
        
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
//
//        int intoNum = Integer.parseInt(userInput);
        
        
//        totalField.setText(Integer.toString(intoNum));

  
    }
    
    
    
    
        
    
}
