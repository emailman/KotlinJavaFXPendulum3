module edu.mailman.kotlinjavafxpendulum3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens edu.mailman.kotlinjavafxpendulum3 to javafx.fxml;
    exports edu.mailman.kotlinjavafxpendulum3;
}