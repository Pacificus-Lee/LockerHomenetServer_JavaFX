module java.prog.lockerhomenetserver_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens java.prog.lockerhomenetserver_javafx to javafx.fxml;
    exports java.prog.lockerhomenetserver_javafx;
}