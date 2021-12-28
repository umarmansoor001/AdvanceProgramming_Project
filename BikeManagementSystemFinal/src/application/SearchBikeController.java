package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SearchBikeController {

    @FXML
    private TextField engineNumber;

    @FXML
    private TextField name;
    
    private Stage stage;
	private Scene scene;
	private Parent root;

    @FXML
    void submitBikeDetails(ActionEvent event) throws IOException {
    	
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("SearchBikeDetails.fxml"));
    	root = loader.load();
    	
    	SearchBikeDetailsController crc = loader.getController();
    	int engine_Number = Integer.parseInt(engineNumber.getText());
    	crc.displayBikeEngineNumber(engine_Number);
    	
    	String bike_Name = name.getText();
    	crc.displayBikeName(bike_Name);
    	
    	Showroom showroom = new Showroom();
    	
    	
    	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();
    	
    	
    	
    	

    }

}
