package pe.edu.cibertec.generate;

import jakarta.persistence.Persistence;

public class JPAGenereate {

    public static void main(String[] args) {

        // Generar objetos en bd
        Persistence.generateSchema("biblioteca", null);

    }

}
