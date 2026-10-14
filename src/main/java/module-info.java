module ni.edu.uam.casoestudiotecnoasistencia {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.edu.uam.casoestudiotecnoasistencia to javafx.fxml;
    exports ni.edu.uam.casoestudiotecnoasistencia;
}