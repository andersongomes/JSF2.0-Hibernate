package br.com.hibernate.utils;

import java.sql.SQLException;

import org.hibernate.Session;

import br.com.hibernate.model.Livro;



public class HibernateTest {

    public static void main(String[] args) throws SQLException {

        @SuppressWarnings("unused")
		Livro livro = new Livro();

        try {
        	Session session = HibernateUtil.getSessionFactory().openSession();
        	System.out.println("Conectou!");
        	session.close();
		} catch (Exception e) {
			System.out.println("Não conectou!");
		}
        /* Criar o banco
        SchemaExport schema = new SchemaExport(new AnnotationConfiguration().configure());
    	schema.create(true, true);
        *///Transaction t = session.beginTransaction();
        //session.save(user);
        //t.commit();
        //System.out.println("ID do Pessoa: " + user.getId());
        
        //user = (Usuario) session.load(Usuario.class, 1L);
        //System.out.println(user.getNome());

       

    }
}
