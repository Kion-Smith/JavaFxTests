package application;
	
import java.awt.Button;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
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
			
			BorderPane root = new BorderPane();
			
			
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
			
			
			Path starPath = new Path();
			
			//Need the moveto object
			MoveTo move = new MoveTo(108,71);
			
			LineTo line1 = new LineTo(321,161);
			LineTo line2 = new LineTo(126,232);
			LineTo line3 = new LineTo(232,52);
			LineTo line4 = new LineTo(269,250);
			LineTo line5 = new LineTo(108,71);
			
			starPath.getElements().add(move);
			starPath.getElements().addAll(line1,line2,line3,line4,line5);
			
			
			Group newGroup = new Group(starPath,testLine,helloText,underTextLine);
			Scene scene = new Scene(newGroup,600,300);
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
