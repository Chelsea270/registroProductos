module org.test.registroproductos {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.test.registroproductos to javafx.fxml;
    exports org.test.registroproductos;
}