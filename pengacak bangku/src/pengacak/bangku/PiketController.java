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
public class PiketController implements Initializable {

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
        Lihat.setText("menyapu : 15,20,34"+"\nmengelap kaca :32,37,1 "+"\nmerapikan bangku : 22,21");
    }

    @FXML
    private void BtnSelasa(ActionEvent event) {
        Lihat.setText("menyapu : 2,5,12"+"\nmengelap kaca :18,11,10 "+"\nmerapikan bangku : 14,26");
    }

    @FXML
    private void BtnRabu(ActionEvent event) {
        Lihat.setText("menyapu : 13,24,38"+"\nmengelap kaca :35,27 "+"\nmerapikan bangku : 30,17");
    }

    @FXML
    private void BtnKamis(ActionEvent event) {
        Lihat.setText("menyapu : 7,33,3"+"\nmengelap kaca :25,9 "+"\nmerapikan bangku : 16,28");
    }

    @FXML
    private void BtnJumat(ActionEvent event) {
        Lihat.setText("menyapu : 4,6,8"+"\nmengelap kaca :19,23,29 "+"\nmerapikan bangku : 31,36");
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
