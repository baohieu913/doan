package Readers.login;

import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class controller {
    @FXML
    private TextField UsernameLogin;
    @FXML
    private PasswordField PasswordLogin;
    @FXML
    private Label wrongLogin;
    public void CreateNewAccount(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        URL urlSceneAdmin = new File("E:\\java\\IdeaProjects\\DoAnOOP\\src\\main\\java\\Readers\\login\\Register New Account.fxml").toURI().toURL();
        FXMLLoader loader = new FXMLLoader();
        Parent readerView = loader.load(urlSceneAdmin);
        Scene sceneReader = new Scene(readerView);
        stage.setScene(sceneReader);
    }
}
