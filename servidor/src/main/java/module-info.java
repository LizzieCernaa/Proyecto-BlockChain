module com.example.servidor {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.servidor to javafx.fxml;
    exports com.example.servidor;
}