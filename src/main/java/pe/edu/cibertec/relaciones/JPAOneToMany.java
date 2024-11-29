package pe.edu.cibertec.relaciones;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.entity.Categoria;
import pe.edu.cibertec.entity.Libro;

import java.util.Arrays;
import java.util.Date;

public class JPAOneToMany {

    public static void main(String[] args) {

        // referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "biblioteca");
        EntityManager em = emf.createEntityManager();

        // cear categoria
        Categoria categoria = new Categoria("C6", "De Terror", null);

        // crear libros
        Libro libro01 = new Libro("A20", "Titulo 20", "Autor 20", new Date(), 20.50, categoria);
        Libro libro02 = new Libro("A21", "Titulo 21", "Autor 21", new Date(), 20.50, categoria);
        Libro libro03 = new Libro("A22", "Titulo 22", "Autor 22", new Date(), 20.50, categoria);

        // agregar libros a la categoria
        categoria.setLibros(Arrays.asList(libro01, libro02, libro03));


        // registrar categoria
        em.getTransaction().begin();
        em.persist(categoria);
        em.getTransaction().commit();

    }


}
