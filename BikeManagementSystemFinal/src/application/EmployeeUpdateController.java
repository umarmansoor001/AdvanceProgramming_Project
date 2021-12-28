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

public class EmployeeUpdateController {
	
	private Stage stage;
	private Scene scene;
	private Parent root;


    @FXML
    private TextField address;

    @FXML
    private TextField cnic;

    @FXML
    private TextField id;

    @FXML
    private TextField name;

    @FXML
    private TextField phoneNumber;

    @FXML
    void updateEmployeeDetails(ActionEvent event) throws ClassNotFoundException, IOException {
    	
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("UpdateEmployeeDetails.fxml"));
    	root = loader.load();
    	
    	UpdateEmployeeDetailsController crc = loader.getController();
    	int Employee_ID = Integer.parseInt(id.getText());
    	crc.displayEmployeeID(Employee_ID);
    	
    	String Employee_Name = name.getText();
    	crc.displayEmployeeName(Employee_Name);
    	
    	String Employee_Address = address.getText();
    	crc.displayEmployeeAddress(Employee_Address);
    	
    	String Employee_PhoneNumber = phoneNumber.getText();
    	crc.displayEmployeePhoneNumber(Employee_PhoneNumber);
    	
    	String Employee_CNIC = cnic.getText();
    	crc.displayEmployeeCNIC(Employee_CNIC);
    	
    	
    	
    	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();
    	
    	
    	Showroom showroom = new Showroom();
    	showroom.ChangeDetail(Employee_ID);
    	//showroom.Add_Employee(Employee_ID, Employee_Name, Employee_Address, Employee_PhoneNumber, Employee_CNIC);

    }

}
