/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengacak.bangku;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class FXMLDocumentController {

    @FXML
    private Label label;

    @FXML
    private Button Masuk;

     @FXML
    private JFXPasswordField Sandi;

    @FXML
    void BtnAMasuk(ActionEvent event) {
        String pin=Sandi.getText();
        String PIN="acak";
        int kesempatan = 3;
        
        
        
        if(pin.equals(PIN)){
            try{
                ((Node)(event.getSource())).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("pilihan.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("Acak");
                stage.show();
            }
            catch(IOException e){
                System.out.println("Failed to create new window"+e);
            }
        }
        else{
            kesempatan -= 1;
            JOptionPane.showMessageDialog(null,"PIN Salah \nTersisa"+kesempatan+"kesempatan lagi !");
            Sandi.setText("");
            pin = "";
            if(kesempatan == 0){
                System.exit(0);
            }
        }

    }

}

