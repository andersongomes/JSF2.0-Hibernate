package br.com.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.hibernate.model.Livro;

/**@
 * 
 * @author Anderson Gomes
 *
 */

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    private HibernateUtil() {
        
    }

    public static SessionFactory getSessionFactory() {

        if (sessionFactory == null) {
            try {
                // Create the SessionFactory from standard (hibernate.cfg.xml)
                // config file.
                AnnotationConfiguration ac = new AnnotationConfiguration();
                ac.addAnnotatedClass(Livro.class);
                sessionFactory = ac.configure().buildSessionFactory();
                //SchemaExport se = new SchemaExport(ac);
                //se.create(true, true);
                

            } catch (Throwable ex) {
                // Log the exception.
                System.err.println("Initial SessionFactory creation failed." + ex);
                throw new ExceptionInInitializerError(ex);
            }

            return sessionFactory;

        } else {
            return sessionFactory;
        }
        
    }

    //public static void main(String[] args) {
    //    HibernateUtil.getSessionFactory();
    //}

}