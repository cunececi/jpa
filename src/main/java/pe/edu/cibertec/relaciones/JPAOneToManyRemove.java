package pe.edu.cibertec.relaciones;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jdk.jfr.Category;
import pe.edu.cibertec.entity.Categoria;

public class JPAOneToManyRemove {

    public static void main(String[] args) {

        // referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "biblioteca");
        EntityManager em = emf.createEntityManager();

        // obtener categoria
        Categoria categoria = em.find(Categoria.class, "C1");

        // eliminar categoria
        em.getTransaction().begin();
        em.remove(categoria);
        em.getTransaction().commit();

    }

}
