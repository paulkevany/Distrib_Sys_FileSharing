package ie.distribsys.controllers;

import java.io.File;
import java.util.ArrayList;

import ie.distribsys.application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ListView;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class SharedFolderController {

	static File[] fileList;

	public static ListView<File> sharedFolderListView = new ListView<File>();

	public static ArrayList<String> fileArrayList;
	static ObservableList<File> fileOL;

	static Stage primaryStage = new Stage();
	static Stage secondStage = new Stage();

	final static FileChooser fileChooser = new FileChooser();
	public static DirectoryChooser directoryChooser = new DirectoryChooser();

	static File dir = directoryChooser.getInitialDirectory();
	
	private static String selectedDirectory;
	private static String selectedPath;
	

	public static void setFolder() {

		
		directoryChooser.setInitialDirectory(new File(System.getProperty("user.home")));
		dir = directoryChooser.showDialog(primaryStage);
		selectedDirectory = dir.getName();
		selectedPath = dir.getAbsolutePath();

		System.out.println("Directory Set!" + selectedDirectory + "\n" + selectedPath);



	}

	public static ArrayList getFiles(ArrayList<String> files) {
		Alert alert = new Alert(AlertType.ERROR);
		
		try {

		// Get files in directory and add to files: files.add(fileindir);

		//fileChooser.setInitialDirectory(new File(selectedPath)); //Pass in folder path instead of hardcoded
		
		//dir = fileChooser.showOpenDialog(secondStage);
		
			File selectedFolder = new File(selectedPath);
			File[] listOfFiles =  selectedFolder.listFiles();
			
			
			for(int i=0; i<listOfFiles.length; i++) {
				
				if(listOfFiles[i].isFile()) {				
					
					files.add(listOfFiles[i].getName());
					
				}else {
					
					//Do nothing
				}
			}
			
			
			
			
			
			
			
			

		
			//alert.setAlertType(AlertType.WARNING);
			//alert.setHeaderText("Empty Directory");
			//alert.setContentText("Can't select files from an empty directory");
			
		

		
	
	}catch(Exception e) {
		
		
		alert.setContentText("An error occured getting the files!");
		alert.setHeaderText("Error");
		alert.showAndWait();
		
	}
		
		return files;
	}
}
