package com.example.retoconjunto1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Login extends Application {

   private static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("Login"));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 600,400));
        primaryStage.show();
    }

    public void checkLogin(String fxml) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(fxml));
        stage.getScene().setRoot(root);
    }

    public static void main(String[] args) {
        launch(args);
    }
}