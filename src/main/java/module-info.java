module com.example.liftoff_coding_challenges {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.liftoff_coding_challenges to javafx.fxml;
    exports com.example.liftoff_coding_challenges;
}