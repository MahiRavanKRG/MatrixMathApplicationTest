module com.company.matrixmathapplicationtest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.company.matrixmathapplicationtest to javafx.fxml;
    exports com.company.matrixmathapplicationtest;
}