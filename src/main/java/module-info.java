module test_and_debug.lr_three {
    requires javafx.controls;
    requires javafx.fxml;


    opens test_and_debug.lr_three to javafx.fxml;
    exports test_and_debug.lr_three;
}