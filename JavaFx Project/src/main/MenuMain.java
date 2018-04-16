package main;

import java.awt.image.PixelGrabber;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MenuMain extends Application
{
	public testMenu tm;

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		Pane root = new Pane();
		root.setPrefSize(800, 600);
		
		InputStream is = Files.newInputStream(Paths.get("resources/testImage.png"));
		Image img = new Image(is);
		is.close();
		
		ImageView imgView = new ImageView(img);
		imgView.setFitWidth(800);
		imgView.setFitHeight(600);
		
		tm = new testMenu();
		
		root.getChildren().addAll(imgView,tm);
		
		Scene scene = new Scene(root);
		scene.setOnKeyPressed(event -> 
		{
			if(event.getCode() == KeyCode.ESCAPE)
			{
				if(!tm.isVisible())
				{
					FadeTransition fade = new FadeTransition(Duration.seconds(.5),tm);
					fade.setFromValue(0);
					fade.setToValue(1);
					tm.setVisible(true);
					fade.play();
					
				}
				else
				{
					FadeTransition fade = new FadeTransition(Duration.seconds(.5),tm);
					fade.setFromValue(1);
					fade.setToValue(0);
					fade.setOnFinished( evt-> tm.setVisible(false));
					fade.play();
				}
			}
		});
		

		
		primaryStage.setTitle("Menu test");;
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	
	public static void main (String [] args)
	{
		launch(args);
	}
	

}
