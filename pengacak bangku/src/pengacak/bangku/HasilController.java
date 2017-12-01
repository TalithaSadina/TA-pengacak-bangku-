/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengacak.bangku;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Random;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HasilController {
     @FXML
    private Button Keluar;

      @FXML
    private TextField siswa1;

    @FXML
    private TextField siswa2;

    @FXML
    private TextField siswa11;

    @FXML
    private TextField siswa12;

    @FXML
    private TextField siswa21;

    @FXML
    private TextField siswa22;

    @FXML
    private TextField siswa31;

    @FXML
    private TextField siswa32;

    @FXML
    private TextField siswa3;

    @FXML
    private TextField siswa4;

    @FXML
    private TextField siswa13;

    @FXML
    private TextField siswa14;

    @FXML
    private TextField siswa23;

    @FXML
    private TextField siswa24;

    @FXML
    private TextField siswa33;

    @FXML
    private TextField siswa34;

    @FXML
    private TextField siswa5;

    @FXML
    private TextField siswa6;

    @FXML
    private TextField siswa15;

    @FXML
    private TextField siswa16;

    @FXML
    private TextField siswa25;

    @FXML
    private TextField siswa26;

    @FXML
    private TextField siswa35;

    @FXML
    private TextField siswa36;

    @FXML
    private TextField siswa7;

    @FXML
    private TextField siswa8;

    @FXML
    private TextField siswa17;

    @FXML
    private TextField siswa18;

    @FXML
    private TextField siswa27;

    @FXML
    private TextField siswa28;

    @FXML
    private TextField siswa37;

    @FXML
    private TextField siswa38;

    @FXML
    private TextField siswa9;

    @FXML
    private TextField siswa10;

    @FXML
    private TextField siswa19;

    @FXML
    private TextField siswa20;

    @FXML
    private TextField siswa29;

    @FXML
    private TextField siswa30;
     @FXML
    private Button Menu;


    @FXML
    private Button Acak;

    @FXML
    void BtnAcak(ActionEvent event) {
         Random angkaRandom = new Random(); 

        int hasil,hasil2,hasil3,hasil4,hasil5,hasil6,hasil7,hasil8,hasil9,hasil10,
                hasil11,hasil12,hasil13,hasil14,hasil15,hasil16,hasil17,hasil18,hasil19,hasil20,hasil21,hasil22,
                hasil23,hasil24,hasil25,hasil26,hasil27,hasil28,hasil29,hasil30,hasil31,hasil32,hasil33,hasil34,
                hasil35,hasil36,hasil37,hasil38,hasils;
  
  hasil = 1 + angkaRandom.nextInt( 38 );      
  hasil2 = 1 + angkaRandom.nextInt( 38 );
  hasil3 = 1 + angkaRandom.nextInt( 38 ); 
  hasil4 = 1 + angkaRandom.nextInt( 38 );
  hasil5 = 1 + angkaRandom.nextInt( 38 );
  hasil6 = 1 + angkaRandom.nextInt( 38 );
  hasil7 = 1 + angkaRandom.nextInt( 38 );
  hasil8 = 1 + angkaRandom.nextInt( 38 );
  hasil9 = 1 + angkaRandom.nextInt( 38 );
  hasil10 = 1 + angkaRandom.nextInt( 38 );
  hasil11 = 1 + angkaRandom.nextInt( 38 );
  hasil12 = 1 + angkaRandom.nextInt( 38 );
  hasil13 = 1 + angkaRandom.nextInt( 38 );
  hasil14 = 1 + angkaRandom.nextInt( 38 );
  hasil15 = 1 + angkaRandom.nextInt( 38 );
  hasil16 = 1 + angkaRandom.nextInt( 38 );
  hasil17 = 1 + angkaRandom.nextInt( 38 );
  hasil18 = 1 + angkaRandom.nextInt( 38 );
  hasil19 = 1 + angkaRandom.nextInt( 38 );
  hasil20 = 1 + angkaRandom.nextInt( 38 );
  hasil21 = 1 + angkaRandom.nextInt( 38 );
  hasil22 = 1 + angkaRandom.nextInt( 38 );
  hasil23 = 1 + angkaRandom.nextInt( 38 );
  hasil24 = 1 + angkaRandom.nextInt( 38 );
  hasil25 = 1 + angkaRandom.nextInt( 38 );
  hasil26 = 1 + angkaRandom.nextInt( 38 );
  hasil27 = 1 + angkaRandom.nextInt( 38 );
  hasil28 = 1 + angkaRandom.nextInt( 38 );
  hasil29 = 1 + angkaRandom.nextInt( 38 );
  hasil30 = 1 + angkaRandom.nextInt( 38 );
  hasil31 = 1 + angkaRandom.nextInt( 38 );
  hasil32 = 1 + angkaRandom.nextInt( 38 );
  hasil33 = 1 + angkaRandom.nextInt( 38 );
  hasil34 = 1 + angkaRandom.nextInt( 38 );
  hasil35 = 1 + angkaRandom.nextInt( 38 );
  hasil36 = 1 + angkaRandom.nextInt( 38 );
  hasil37 = 1 + angkaRandom.nextInt( 38 );
  hasil38 = 1 + angkaRandom.nextInt( 38 );
   hasils = 1 + angkaRandom.nextInt( 38 );
  
  
  
  
  
  
  
 
  if(hasil == hasil2){
      siswa1.setText(String.valueOf(hasil));
      siswa2.setText(String.valueOf(hasils));
  }
  else if(hasil == hasil3){
     siswa1.setText(String.valueOf(hasil)); 
     siswa3.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil4){
      siswa1.setText(String.valueOf(hasil)); 
      siswa4.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil5){
      siswa1.setText(String.valueOf(hasil)); 
      siswa5.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil6){
      siswa1.setText(String.valueOf(hasil)); 
      siswa6.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil7){
      siswa1.setText(String.valueOf(hasil)); 
      siswa7.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil8){
      siswa1.setText(String.valueOf(hasil)); 
      siswa8.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil9){
      siswa1.setText(String.valueOf(hasil)); 
      siswa9.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil10){
      siswa1.setText(String.valueOf(hasil)); 
      siswa10.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil11){
      siswa1.setText(String.valueOf(hasil)); 
      siswa11.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil12){
      siswa1.setText(String.valueOf(hasil)); 
      siswa12.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil13){
      siswa1.setText(String.valueOf(hasil)); 
      siswa13.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil14){
      siswa1.setText(String.valueOf(hasil)); 
      siswa14.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil15){
      siswa1.setText(String.valueOf(hasil)); 
      siswa15.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil16){
      siswa1.setText(String.valueOf(hasil)); 
      siswa16.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil17){
      siswa1.setText(String.valueOf(hasil)); 
      siswa17.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil18){
      siswa1.setText(String.valueOf(hasil)); 
      siswa18.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil19){
      siswa1.setText(String.valueOf(hasil)); 
      siswa19.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil20){
      siswa1.setText(String.valueOf(hasil)); 
      siswa20.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil21){
      siswa1.setText(String.valueOf(hasil)); 
      siswa21.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil22){
      siswa1.setText(String.valueOf(hasil));
      siswa22.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil23){
      siswa1.setText(String.valueOf(hasil));
      siswa23.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil24){
      siswa1.setText(String.valueOf(hasil));
      siswa24.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil25){
      siswa1.setText(String.valueOf(hasil));
      siswa25.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil26){
      siswa1.setText(String.valueOf(hasil));
      siswa26.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil27){
      siswa1.setText(String.valueOf(hasil));
      siswa27.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil28){
      siswa1.setText(String.valueOf(hasil));
      siswa28.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil29){
      siswa1.setText(String.valueOf(hasil));
      siswa29.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil30){
      siswa1.setText(String.valueOf(hasil));
      siswa30.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil31){
      siswa1.setText(String.valueOf(hasil));
      siswa31.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil32){
      siswa1.setText(String.valueOf(hasil));
      siswa32.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil33){
      siswa1.setText(String.valueOf(hasil));
      siswa33.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil34){
      siswa1.setText(String.valueOf(hasil));
      siswa34.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil35){
      siswa1.setText(String.valueOf(hasil));
      siswa35.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil36){
      siswa1.setText(String.valueOf(hasil));
      siswa36.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil37){
      siswa1.setText(String.valueOf(hasil));
      siswa37.setText(String.valueOf(hasils)); 
  }
  else if(hasil == hasil38){
      siswa1.setText(String.valueOf(hasil));
      siswa38.setText(String.valueOf(hasils)); 
  }
  
  else{
  siswa1.setText(String.valueOf(hasil));
  siswa2.setText(String.valueOf(hasil2));
  siswa3.setText(String.valueOf(hasil3));
  siswa4.setText(String.valueOf(hasil4));
  siswa5.setText(String.valueOf(hasil5));
  siswa6.setText(String.valueOf(hasil6));
  siswa7.setText(String.valueOf(hasil7));
  siswa8.setText(String.valueOf(hasil8));
  siswa9.setText(String.valueOf(hasil9));
  siswa10.setText(String.valueOf(hasil10));
  siswa11.setText(String.valueOf(hasil11));
  siswa12.setText(String.valueOf(hasil12));
  siswa13.setText(String.valueOf(hasil13));
  siswa14.setText(String.valueOf(hasil14));
  siswa15.setText(String.valueOf(hasil15));
  siswa16.setText(String.valueOf(hasil16));
  siswa17.setText(String.valueOf(hasil17));
  siswa18.setText(String.valueOf(hasil18));
  siswa19.setText(String.valueOf(hasil19));
  siswa20.setText(String.valueOf(hasil20));
  siswa21.setText(String.valueOf(hasil21));
  siswa22.setText(String.valueOf(hasil22));
  siswa23.setText(String.valueOf(hasil23));
  siswa24.setText(String.valueOf(hasil24));
  siswa25.setText(String.valueOf(hasil25));
  siswa26.setText(String.valueOf(hasil26));
  siswa27.setText(String.valueOf(hasil27));
  siswa28.setText(String.valueOf(hasil28));
  siswa29.setText(String.valueOf(hasil29));
  siswa30.setText(String.valueOf(hasil30));
  siswa31.setText(String.valueOf(hasil31));
  siswa32.setText(String.valueOf(hasil32));
  siswa33.setText(String.valueOf(hasil33));
  siswa34.setText(String.valueOf(hasil34));
  siswa35.setText(String.valueOf(hasil35));
  siswa36.setText(String.valueOf(hasil36));
  siswa37.setText(String.valueOf(hasil37));
  siswa38.setText(String.valueOf(hasil38));
    }
    }
  
    
    

 @FXML
void BtnKeluar(ActionEvent event) {
        System.exit(0);
        

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

    

