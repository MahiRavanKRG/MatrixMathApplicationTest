package com.company.matrixmathapplicationtest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.charset.Charset;

public class MatrixApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        Group root = new Group();

        FXMLLoader fxmlLoader = new FXMLLoader(MatrixApplication.class.getResource("D:\\CODES\\Java\\MatrixMathApplicationTest\\src\\main\\resources\\com\\company\\matrixmathapplicationtest\\try.fxml"));
        Scene scene = new Scene(fxmlLoader.load() , Color.BISQUE);
    //   Scene scene = new Scene(root , Color.BISQUE);

        Stage primaryStage = new Stage();
        primaryStage.setTitle("MatrixApplication");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        Application.launch();
    }
}
