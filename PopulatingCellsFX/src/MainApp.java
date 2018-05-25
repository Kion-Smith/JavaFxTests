
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application 
{

	 private Stage primaryStage;
	 private BorderPane  rootLayout;
	
	@Override
	public void start(Stage pS)
	{
		primaryStage = pS;
		primaryStage.setTitle("Address App Book");
		
		initRootLayout();
		
		showPersonOverview();
		
	}

	public static void main(String[] args) 
	{
		launch(args);
	}
	
	public void initRootLayout()
	{
		try 
		{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();
			
			Scene scene = new Scene(rootLayout);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void showPersonOverview()
	{
		try 
		{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("personOverview.fxml"));
			AnchorPane personOverview = (AnchorPane) loader.load();
			
			Scene scene = new Scene(personOverview);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
	
	public Stage getPrimaryStage() 
	{
		return primaryStage;
	}

	
}
