package com.company.matrixmathapplicationtest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;

public class MatrixApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {

        Group root = new Group();

    //    FXMLLoader fxmlLoader = new FXMLLoader(Paths.get("D:\\CODES\\Java\\MatrixMathApplicationTest\\src\\main\\resources\\com\\company\\matrixmathapplicationtest\\try.fxml").toUri().toURL()) ; // = new FXMLLoader("D:\\CODES\\Java\\MatrixMathApplicationTest\\src\\main\\resources\\com\\company\\matrixmathapplicationtest\\try.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(MatrixApplication.class.getResource("try.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
    //   Scene scene = new Scene(root , Color.BISQUE);


        primaryStage.setTitle("MatrixApplication");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        Application.launch();
    }
}
