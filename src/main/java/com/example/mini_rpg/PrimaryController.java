package com.example.mini_rpg;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchtoJoueur() throws IOException {
        Main.setRoot("Joueur");
    }
}
