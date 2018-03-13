package application;
	
import java.awt.Button;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try 
		{
			Line underTextLine = new Line();
			Line testLine = new Line();
			Text helloText = new Text();
			//Button testButton = new Button(ActionEvent e);
			Group newGroup = new Group(testLine,helloText,underTextLine);
			BorderPane root = new BorderPane();
			Scene scene = new Scene(newGroup,400,400);
			
			//creating the line
			testLine.setStartX(10);
			testLine.setStartY(200);
			
			testLine.setEndX(390);
			testLine.setEndY(300);
			
			// line under text
			underTextLine.setStartX(100);
			underTextLine.setStartY(105);
			
			underTextLine.setEndX(250);
			underTextLine.setEndY(105);
			
			
			
			//creating the text
			helloText.setX(100);
			helloText.setY(100);
			
			helloText.setText("Hello world, first JavaFX App");
			
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
