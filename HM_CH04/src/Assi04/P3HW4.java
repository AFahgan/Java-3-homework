package Assi04;

import java.util.Map;
import java.util.TreeMap;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class P3HW4 extends Application{

   
    @Override
    public void start(Stage primaryStage) throws Exception {

    Pane paneTableView = FXMLLoader.load(getClass().getResource("TableViewPane.fxml"));

       Pane paneTableView2 =  FXMLLoader.load(getClass().getResource("TableViewPane2.fxml"));


        Map<String, Pane> mapPanes = new TreeMap<>();
        mapPanes.put("TableView", paneTableView);
        mapPanes.put("TableView2", paneTableView2);
        Scene scene = new Scene(mapPanes.get("TableView2"));
        primaryStage.setTitle("Chapter 4 Homework");

        primaryStage.setScene(scene);
        primaryStage.show();
    }
     public static void main(String[] args) {
        launch(args);
    }

}
