package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculatorView extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/calculator_view.fxml"));
        Parent root = fxmlLoader.load();

        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Calculator");
        primaryStage.setResizable(false);
        primaryStage.show();

//        primaryStage.setTitle("Calculator");
//        primaryStage.setWidth(250);
//        primaryStage.setHeight(350);
//        primaryStage.setResizable(false);
//        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
