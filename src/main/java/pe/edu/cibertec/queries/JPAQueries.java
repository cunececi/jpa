package pe.edu.cibertec.queries;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import pe.edu.cibertec.entity.Libro;

public class JPAQueries {

    public static void main(String[] args) {

        // referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "biblioteca");
        EntityManager em = emf.createEntityManager();

        /**
         * SELECT
         */
//        TypedQuery<Libro> query = em.createQuery("select l from Libro l", Libro.class);
//        query.getResultList().forEach(System.out::println);

        /**
         * SELECT * where
         */
/*
       TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.autor = :autor and l.precio > :precio", Libro.class);
        query.setParameter("autor", "Claudia");
        query.setParameter("precio", 50);
        query.getResultList().forEach(System.out::println);
*/

        /**
         * SELECT * where - between
         */
//        TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.precio between :inicio and :final", Libro.class);
//        query.setParameter("inicio", 30);
//        query.setParameter("final", 50);
//        query.getResultList().forEach(System.out::println);


        /**
         * SELECT * where - in
         */
    //    TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.autor in ('Claudia','Cesar')", Libro.class);
    //    query.getResultList().forEach(System.out::println);


        /**
         * SELECT * VALORES ESCALABLES
         */
//        TypedQuery<String> query = em.createQuery("select l.autor from Libro l where l.autor in ('Claudia','Cesar')", String.class);
//        query.getResultList().forEach(System.out::println);


        /**
         * SELECT * VALORES ESCALALABLES - DISTINCT
         */
//        TypedQuery<String> query = em.createQuery("select distinct l.autor from Libro l where l.autor in ('Claudia','Cesar')", String.class);
//        query.getResultList().forEach(System.out::println);

        /**
         * SELECT * where - order by
         */
//          TypedQuery<Libro> query = em.createQuery("select l from Libro l order by l.precio desc", Libro.class);
//          query.getResultList().forEach(System.out::println);



        /**
         * SELECT * GROUP BY
                */
//        TypedQuery<Object[]> query = em.createQuery("select l.autor, count(l) from Libro l group by l.autor", Object[].class);
//        query.getResultList().forEach(element -> System.out.println(element[0] + "->" + element[1]));


        /**
         * SELECT * where - IS NULL / IS NOT NULL
         */
//          TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.autor is null", Libro.class);
//          query.getResultList().forEach(System.out::println);


        /**
         * SELECT * where - like
         */
        TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.titulo like 'c%'", Libro.class);
        query.getResultList().forEach(System.out::println);

    }

}
