package ch06.controller;

import java.io.IOException;

import ch06.RunProgram;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginPageController {
	
	@FXML
	private Label labelMessage;
	
	@FXML
	private TextField textFieldUsername;
	
	@FXML
	private PasswordField passwordFieldPassword;
	
	public void login() throws IOException {
		if(textFieldUsername.getText().equalsIgnoreCase("jailani") &&
				passwordFieldPassword.getText().equals("rahman")) {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/MainPage.fxml"));
			Parent root = fxmlLoader.load();
			MainPageController mpc = fxmlLoader.getController();
			mpc.setUsername("jailani");
			Scene scene = new Scene(root, 800, 600);
			RunProgram.stage.setScene(scene);
		} else {
			labelMessage.setText("Wrong username or password");
		}
	}
}
