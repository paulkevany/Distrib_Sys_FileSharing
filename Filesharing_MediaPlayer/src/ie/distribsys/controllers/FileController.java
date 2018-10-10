package ie.distribsys.controllers;


import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ResourceBundle;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class FileController{
	
	@FXML
	public ListView<String> sharedFolderListView;
	
	SharedFolderController sc = new SharedFolderController();

	private String sharedFolderPath = "";
	private String localFolderPath = "";
	
	protected ArrayList<String> files = new ArrayList<>();
	protected ListProperty<String> listProperty = new SimpleListProperty<>();
	
	
	
	public void setSharedFolder() {

		SharedFolderController.setFolder(); //Set the folder		
		files.addAll(sc.getFiles(files));
		
		
		sharedFolderListView.itemsProperty().bind(listProperty);
		
		
		
		System.out.println("Setting");
		listProperty.set(FXCollections.observableArrayList(files));
		
		
		
		
		

	}

	public void setLocalFolder() {

		LocalFolderController.setLocalFolder();

	}

	

}