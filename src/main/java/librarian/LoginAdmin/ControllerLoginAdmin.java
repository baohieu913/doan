package librarian.LoginAdmin;

import com.sun.javafx.scene.control.FormatterAccessor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.util.Pair;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ControllerLoginAdmin {
    @FXML
    private TextField Username;
    @FXML
    private PasswordField Password;
    @FXML
    private Label wrongAccount;
    public void login(ActionEvent event) throws IOException {
        String userName = Username.getText();
        String password = Password.getText();
        if (userName.equals("admin") && password.equals("password")) {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            URL urlSceneAdmin = new File("E:\\java\\IdeaProjects\\DoAnOOP\\src\\main\\java\\librarian\\Admin\\Admin.fxml").toURI().toURL();
            FXMLLoader loader = new FXMLLoader();
            Parent adminView = loader.load(urlSceneAdmin);
            Scene sceneAdmin = new Scene(adminView);
            stage.setScene(sceneAdmin);
        }

    }
    public void cancel(ActionEvent event) {


    }

}
