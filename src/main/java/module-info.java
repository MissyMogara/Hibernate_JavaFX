module org.proyect.hibernatejavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;
    requires static lombok;
    requires org.hibernate.orm.core;
    requires jakarta.transaction;


    opens org.proyect.hibernatejavafx to javafx.fxml;
    exports org.proyect.hibernatejavafx;
}