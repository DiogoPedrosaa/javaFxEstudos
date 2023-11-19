module com.example.javafxnelio {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.javafxnelio.controllers to javafx.fxml;
    exports com.example.javafxnelio;
}