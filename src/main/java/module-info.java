module com.pos.commerce {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.pos.commerce to javafx.fxml;
    exports com.pos.commerce;
}