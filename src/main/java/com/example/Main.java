package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main {

  public static void main(String[] args) {
    Example.launch(Example.class, args);
  }

  public static class Example extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
      primaryStage.setScene(new Scene(new Label("Hello World")));
      primaryStage.show();
    }
  }
}
