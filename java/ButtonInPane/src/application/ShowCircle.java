package application;

import javafx.application.Application;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class ShowCircle extends Application {
	
	//override the start method in the Application
	public void start(Stage primaryStage){
		//create a circle
		Circle circle = new Circle();
		circle.setCenterX(100);
		circle.setCenterY(100);
		circle.setRadius(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		
		//create a pane to hold the circle
		Pane pane = new Pane();
		pane.getChildren().add(circle);
		
		//create a scene and place it in the stage
		Scene scene = new Scene(pane,300,300);
		primaryStage.setTitle("SHOW A CIRCLE");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launch(args);

	}

}
