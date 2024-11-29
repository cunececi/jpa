package pe.edu.cibertec.relaciones;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.entity.Categoria;
import pe.edu.cibertec.entity.Libro;

import java.util.Arrays;
import java.util.Date;

public class JPAManyToOne {

    public static void main(String[] args) {

        // referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "biblioteca");
        EntityManager em = emf.createEntityManager();

        // crear categoria
        Categoria categoria = new Categoria("C100", "Categoria 100", null);

        // crear libro
        Libro libro = new Libro("A100", "Titulo 100", "Autor 100", new Date(), 20.50, categoria);

        //Agregar el libro a la categoria
        categoria.setLibros(Arrays.asList(libro));

        // registrar libro
        em.getTransaction().begin();
        em.persist(libro);
        em.getTransaction().commit();

    }

}
