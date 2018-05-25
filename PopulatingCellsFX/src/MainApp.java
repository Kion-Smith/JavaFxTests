
import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application 
{

	 private Stage primaryStage;
	 private BorderPane  rootLayout;
	 
	 private ObservableList<Person> personData = FXCollections.observableArrayList();
	 
	 public MainApp() 
	 {
	        // Add some sample data
	        personData.add(new Person("1", "2"));
	        personData.add(new Person("Ruth", "Mueller"));
	        personData.add(new Person("Heinz", "Kurz"));
	        personData.add(new Person("Cornelia", "Meier"));
	        personData.add(new Person("Werner", "Meyer"));
	        personData.add(new Person("Lydia", "Kunz"));
	        personData.add(new Person("Anna", "Best"));
	        personData.add(new Person("Stefan", "Meier"));
	        personData.add(new Person("Martin", "Mueller"));
	 }
	 
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
			
	        rootLayout.setCenter(personOverview);

	        PersonOverviewController controller = loader.getController();
	        controller.setMainApp(this);
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
	
	public ObservableList<Person> getPersonData() 
	{
	        return personData;
	}
	
}
