package application;

import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class HelloFX extends Application {
	
	//override the start method in the application class
	public void start(Stage primaryStage){
		//create a scene and place a button in the scene
		StackPane pane = new StackPane();
		pane.getChildren().add(new Button("Hello JavaFX"));
		Scene scene = new Scene(pane,300,200);
		//set a stage title
		primaryStage.setTitle("Button in a pane");
		//place the scene in stage
		primaryStage.setScene(scene);
		//display the stage
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
