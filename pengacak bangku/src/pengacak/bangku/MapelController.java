/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengacak.bangku;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class MapelController implements Initializable {

    @FXML
    private TextArea Lihat;
    @FXML
    private Button Senin;
    @FXML
    private Button Selasa;
    @FXML
    private Button Rabu;
    @FXML
    private Button Kamis;
    @FXML
    private Button Jumat;
      @FXML
    private Button Menu;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BtnSenin(ActionEvent event) {
        
        
        Lihat.setText("pelajaran ke1 : "+" Upacara"+" "+"\npelajaran ke2-3 : "+" PKWU"+"\npelajaran ke4 : BK"+"\npelajaran ke5-10:PPL");
    }

    @FXML
    private void BtnSelasa(ActionEvent event) {
        Lihat.setText("pelajaran ke1-3 : B.Indonesia"+"\npelajaran ke4-5: Fisika"+"\npelajaran ke6-8 : Mat"+"\npelajaran ke9-10: PKN");
    }

    @FXML
    private void BtnRabu(ActionEvent event) {
        Lihat.setText("pelajaran ke1-6 : Basdat"+"\npelajaran ke7-8: AdSer"+"\npelajaran ke9-10 : PJOK");
    }

    @FXML
    private void BtnKamis(ActionEvent event) {
        Lihat.setText("pelajaran ke1-2 : SISTTEL"+"\npelajaran ke3-4: SI"+"\npelajaran ke5-6 : PEMGRAF"+"\npelajaran ke7-8: PAI"+"\npelajaran ke9-10: SENBUD");
    }

    @FXML
    private void BtnJumat(ActionEvent event) {
        Lihat.setText("pelajaran ke2-4 : B.Inggris"+"\npelajaran ke5-10: PBO");
    }
      @FXML
    void BtnMenu(ActionEvent event) throws IOException {
        ((Node)(event.getSource())).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("pilihan.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("Acak");
                stage.show();

    }
    
}