module com.proyecto.presionmonitorapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.proyecto.presionmonitorapp to javafx.fxml;
    exports com.proyecto.presionmonitorapp;
    exports com.proyecto.presionmonitorapp.controlador;
    opens com.proyecto.presionmonitorapp.controlador to javafx.fxml;
}
