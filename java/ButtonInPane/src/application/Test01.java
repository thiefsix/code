package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Test01 extends Application {
	//override the start method in the Application class
	public void start (Stage primaryStage){
		//create a scene and place the button in the scene
		StackPane pane = new StackPane();
		pane.getChildren().add(new Button("JavaFX"));
		Scene scene = new Scene(pane,200,50);
		//set the Stage title
		primaryStage.setTitle("Test01");
		//set the scene in the Stage
		primaryStage.setScene(scene);
		//display the stage
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launch(args);
		
	}

}
