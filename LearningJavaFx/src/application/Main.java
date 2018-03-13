package application;
	
import java.awt.Button;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try 
		{
			Line testLine = new Line();
			//Button testButton = new Button(ActionEvent e);
			Group newGroup = new Group(testLine);
			BorderPane root = new BorderPane();
			Scene scene = new Scene(newGroup,400,400);
			
			testLine.setStartX(10);
			testLine.setStartY(10);
			
			testLine.setEndX(390);
			testLine.setEndY(390);
			
			scene.setFill(Color.RED);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setTitle("Testing in JavaFX");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
