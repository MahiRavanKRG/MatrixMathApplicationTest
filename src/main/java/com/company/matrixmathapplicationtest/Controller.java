package com.company.matrixmathapplicationtest;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    private Stage primaryStage ;
    private Scene scene ;
    private Node root ;

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

    public void switchToSceneDone(ActionEvent event) throws IOException{
        try {
            Parent root = FXMLLoader.load(getClass().getResource("done.fxml"));
            primaryStage = (Stage) (  (Node)  event.getSource()  ).getScene().getWindow();
            scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();


        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
