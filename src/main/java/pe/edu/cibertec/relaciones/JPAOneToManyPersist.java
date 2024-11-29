package pe.edu.cibertec.relaciones;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.entity.Categoria;
import pe.edu.cibertec.entity.Libro;

import java.util.Arrays;
import java.util.Date;

public class JPAOneToManyPersist {

    public static void main(String[] args) {

        // referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "biblioteca");
        EntityManager em = emf.createEntityManager();

        // crear categoria
        Categoria categoria = new Categoria("C200", "Categoria 200", null);

        // crear libros
        Libro libro01 = new Libro("A201", "Titulo 201", "Autor 201", new Date(), 20.50, categoria);
        Libro libro02 = new Libro("A202", "Titulo 202", "Autor 202", new Date(), 20.50, categoria);
        Libro libro03 = new Libro("A203", "Titulo 203", "Autor 203", new Date(), 20.50, categoria);

        // agregar libros a la categoria
        categoria.setLibros(Arrays.asList(libro01, libro02, libro03));

        // registrar categoria
        em.getTransaction().begin();
        em.persist(categoria);
        em.getTransaction().commit();


    }

}
