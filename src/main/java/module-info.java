module eus.ehu.demo01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens eus.ehu.demo01 to javafx.fxml;
    exports eus.ehu.demo01;
}