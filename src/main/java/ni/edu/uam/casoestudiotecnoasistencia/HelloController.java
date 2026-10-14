package ni.edu.uam.casoestudiotecnoasistencia;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
//l
public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
