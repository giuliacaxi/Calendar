package br.com.calendar.controllers;

import br.com.calendar.SceneManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML private TextField emailField;
    @FXML private PasswordField passwordField;

    @FXML private Label emailErrorLabel;
    @FXML private Label passwordErrorLabel;
    @FXML private Label generalErrorLabel;

    @FXML private Hyperlink forgotPasswordLink;
    @FXML private Hyperlink signupLink;
    @FXML private Button loginButton;

    @FXML
    private void handleLogin() {
        // Leaving for API integration later
    }

    @FXML
    private void handleGoogleLogin() {
        // Leaving for API integration later
    }

    @FXML
    private void handleGithubLogin() {
        // Leaving for API integration later
    }

    @FXML
    private void handleGoToSignup() {
        SceneManager.navigate("/signup");
    }

    @FXML
    private void handleGoToForgotPassword(){
        SceneManager.navigate("/esqueci-minha-senha");
    }

}
