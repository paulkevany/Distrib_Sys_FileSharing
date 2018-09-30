package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("./Main.fxml"));
		    
	        Scene scene = new Scene(root, 300, 275);
	    
	        primaryStage.setTitle("FXML Welcome");
	        primaryStage.setScene(scene);
	        primaryStage.show();
		} catch(Exception e) {
			System.out.println("Unable to render GUI Elements");
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
