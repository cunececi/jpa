package pe.edu.cibertec.relaciones;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.entity.Estudiante;
import pe.edu.cibertec.entity.Libro;

public class JPAManyToMany {

    public static void main(String[] args) {
        // Ho
        // referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "biblioteca");
        EntityManager em = emf.createEntityManager();

        // obtener estudiante
        Estudiante estudiante = em.find(Estudiante.class, "E1");
        estudiante.getCursos().forEach(System.out::println);

    }

}
