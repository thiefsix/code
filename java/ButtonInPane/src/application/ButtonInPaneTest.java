package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPaneTest extends Application {
	public void start(Stage primaryStage){
		//Create a scene and place a button in the scene
		StackPane pane =new StackPane();
		pane.getChildren().add(new Button("OK"));
		Scene scene = new Scene(pane,300,200);
		//set the stage title
		primaryStage.setTitle("Button in a pane");
		//place the scene in the stage
		primaryStage.setScene(scene);
		//display the stage
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
