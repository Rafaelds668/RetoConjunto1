module com.example.retoconjunto1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;


    opens com.example.retoconjunto1 to javafx.fxml;
    exports com.example.retoconjunto1;
}