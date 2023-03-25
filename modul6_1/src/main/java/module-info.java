module com.example.modul6_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.modul6_1 to javafx.fxml;
    exports com.example.modul6_1;
}