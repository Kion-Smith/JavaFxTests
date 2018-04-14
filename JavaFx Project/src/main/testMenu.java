package main;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class testMenu extends Parent 
{
	public final int offset = 400;
	
	public testMenu()
	{
		
		VBox menu0 = new VBox(10);
		VBox menu1= new VBox(10);
		
		menu0.setTranslateX(100);
		menu0.setTranslateY(200);
		
		menu1.setTranslateX(100);
		menu1.setTranslateY(200);
		
		menuButtons btnResume = new menuButtons("Resume");
		menuButtons btnOption = new menuButtons("Options");
		menuButtons btnBack = new menuButtons("Back");
		menuButtons btnSound = new menuButtons("Sound");
		menuButtons btnVideo = new menuButtons("Video");
		menuButtons btnExit = new menuButtons("Exit");
		
		btnResume.setOnMouseClicked( event ->
		{
			
			FadeTransition fade = new FadeTransition(Duration.seconds(.5),this);
			fade.setFromValue(1);
			fade.setToValue(0);
			fade.setOnFinished(evt -> this.setVisible(false));
			fade.play();
			
		});
		
		btnOption.setOnMouseClicked( event ->
		{
			getChildren().add(menu1);
			
			TranslateTransition translateFoward = new TranslateTransition(Duration.seconds(.25),menu0);
			translateFoward.setToX(menu0.getTranslateX() - offset);
			
			TranslateTransition translateBack = new TranslateTransition(Duration.seconds(.5),menu1);
			translateBack.setToX(menu0.getTranslateX());
			
			translateFoward.play();
			translateBack.play();
			
			translateFoward.setOnFinished(evt -> 
			{
				getChildren().remove(menu0);
			});

			
		});
		
		btnBack.setOnMouseClicked( event ->
		{
			getChildren().add(menu0);
			
			TranslateTransition translateFoward = new TranslateTransition(Duration.seconds(.25),menu1);
			translateFoward.setToX(menu1.getTranslateX() + offset);
			
			TranslateTransition translateBack = new TranslateTransition(Duration.seconds(.5),menu0);
			translateBack.setToX(menu1.getTranslateX());
			
			translateFoward.play();
			translateBack.play();
			
			translateFoward.setOnFinished(evt -> 
			{
				getChildren().remove(menu1);
			});
		});
		
		btnExit.setOnMouseClicked( event ->
		{
			System.exit(0);
		});
		
		
		menu0.getChildren().addAll(btnResume,btnOption,btnExit);
		menu1.getChildren().addAll(btnBack,btnSound,btnVideo);
		Rectangle bg = new Rectangle(800,600);
		bg.setFill(Color.GREY);
		bg.setOpacity(.4);
		
		getChildren().addAll(bg,menu0);
	}
	
	
}
