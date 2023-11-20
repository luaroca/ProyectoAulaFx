package co.edu.unicesar.proyectoaulafx;

import java.io.IOException;
import javafx.fxml.FXML;

public class Inicio {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("login1");
    }
}