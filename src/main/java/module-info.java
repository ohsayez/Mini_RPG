module com.example.mini_rpg {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mini_rpg to javafx.fxml;
    exports com.example.mini_rpg;
}