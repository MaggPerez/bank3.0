module test.bankproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens test.bankproject to javafx.fxml;
    exports test.bankproject;
}
