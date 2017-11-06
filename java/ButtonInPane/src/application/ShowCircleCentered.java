package application;

import java.util.Stack;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircleCentered extends Application {
	//override the start method
	public void start(Stage primaryStage){
		//create a pane
		Pane pane = new Pane();
		
		//create a circle
		Circle circle = new Circle();
		circle.centerXProperty().bind(pane.widthProperty().divide(2));
		circle.centerYProperty().bind(pane.heightProperty().divide(2));
		circle.setRadius(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		//Add circle to the pane
		pane.getChildren().add(circle);
		
		//Create a scene and place it in the stage
		Scene scene = new Scene(pane,200,200);
		//set the stage title
		primaryStage.setTitle("ShowCircle");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launch(args);

	}

}
