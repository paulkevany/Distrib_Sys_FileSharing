package ie.distribsys.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/Main.fxml"));

			Scene scene = new Scene(root, 600, 500);

			primaryStage.setTitle("Distributed Systems - File Share");
			primaryStage.setScene(scene);
			primaryStage.show();

			primaryStage.setResizable(false);

		} catch (Exception e) {
			System.out.println("Unable to render GUI Elements" + "\n" + e);
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
