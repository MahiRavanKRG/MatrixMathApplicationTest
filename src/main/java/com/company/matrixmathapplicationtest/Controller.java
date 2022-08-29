package com.company.matrixmathapplicationtest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    private Stage primaryStage ;
    private Scene scene ;
    private Node root ;
    public double[][] x = new double[3][3] ;

    @FXML
    TextField a11 , a12 , a13 , a21 , a22 , a23 , a31 , a32 , a33;

    @FXML
    TextField Answer11 , Answer12 , Answer13 , Answer21 , Answer22 , Answer23 , Answer31 , Answer32 , Answer33 ;

    @FXML
    Label ANSWER11 , ANSWER12 , ANSWER13 , ANSWER21 , ANSWER22 , ANSWER23 , ANSWER31 , ANSWER32 , ANSWER33 ;



    public void switchToSceneDone(ActionEvent event) throws IOException{

       try {
            String Arnold1, Arnold2, Arnold3, Arnold4, Arnold5, Arnold6, Arnold7, Arnold8, Arnold9;



            Arnold1 = a11.getText();
            Arnold2 = a12.getText();
            Arnold3 = a13.getText();
            Arnold4 = a21.getText();
            Arnold5 = a22.getText();
            Arnold6 = a23.getText();
            Arnold7 = a31.getText();
            Arnold8 = a32.getText();
            Arnold9 = a33.getText();


            Parent root = FXMLLoader.load(getClass().getResource("done3.fxml"));
            primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            primaryStage.setScene(scene);
            // ######################################################################################################
            // Looks like I figured the problem
            // new stage needs a new controller.
           ANSWER11.setText("a");
           ANSWER12.setText("a");
           ANSWER13.setText("a");
           ANSWER21.setText("a");
           ANSWER22.setText("a");
           ANSWER23.setText("a");
           ANSWER31.setText("a");
           ANSWER32.setText("a");
           ANSWER33.setText("a");
          //  setLable(Arnold1, Arnold2, Arnold3, Arnold4, Arnold5, Arnold6, Arnold7, Arnold8, Arnold9);

            primaryStage.show();


        }catch (Exception e){
           e.printStackTrace();

       }
    }

    public void setLable(String x11 , String x12 , String x13 , String x21 , String x22 , String x23 , String x31 , String x32 , String x33) throws Exception{
        try {

//            x[0][0] = a11 ;
//            x[0][1] = a12 ;
//            x[0][2] = a13 ;
//            x[1][0] = a21 ;
//            x[1][1] = a22 ;
//            x[1][2] = a23 ;
//            x[2][0] = a31 ;
//            x[2][1] = a32 ;
//            x[2][2] = a33 ;









        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public void OnClearButtonPress(ActionEvent event) throws Exception{


        a11.clear();
        a12.clear();
        a13.clear();
        a21.clear();
        a22.clear();
        a23.clear();
        a31.clear();
        a32.clear();
        a33.clear();

//        try {
//            Parent root = FXMLLoader.load(getClass().getResource("start.fxml"));
//            primaryStage = (Stage) (  (Node)  event.getSource()  ).getScene().getWindow();
//            scene = new Scene(root);
//            primaryStage.setScene(scene);
//            primaryStage.show();
//
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }



    public void switchToSceneStart(ActionEvent event) throws IOException{
        try {
            Parent root = FXMLLoader.load(getClass().getResource("start.fxml"));
            primaryStage = (Stage) (  (Node)  event.getSource()  ).getScene().getWindow();
            scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();


        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
