module com.example.modul6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.modul6 to javafx.fxml;
    exports com.example.modul6;
}