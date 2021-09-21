module de.entsesselt.organizer {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens de.entsesselt.organizer to javafx.fxml;
    exports de.entsesselt.organizer;
}