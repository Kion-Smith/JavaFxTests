package main;

import javafx.geometry.Pos;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.Glow;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class menuButtons extends StackPane
{
	public Text text;
	
	public menuButtons(String s)
	{
		text = new Text(s);
		text.setFont(text.getFont().font(20));
		Rectangle bg = new Rectangle(250,30);
		bg.setOpacity(.6);
		bg.setFill(Color.WHITE);
		bg.setEffect(new GaussianBlur(3.5));
		
		setAlignment(Pos.CENTER_LEFT);
		setRotate(-.5);
		getChildren().addAll(bg, text);
		
		setOnMouseEntered(event ->
		{
			bg.setTranslateX(10);
			text.setTranslateX(10);
			
			bg.setFill(Color.BLACK);
			text.setFill(Color.WHITE);
			
		});
		
		setOnMouseExited(event ->
		{
			bg.setTranslateX(0);
			text.setTranslateX(0);
			
			bg.setFill(Color.WHITE);
			text.setFill(Color.BLACK);
			
		});
		
		DropShadow  drop = new DropShadow(50,Color.WHITE);
		drop.setInput(new Glow());
		
		setOnMousePressed(event -> setEffect(drop));
		setOnMouseReleased(event -> setEffect(null));
		
		
	}
	
}
