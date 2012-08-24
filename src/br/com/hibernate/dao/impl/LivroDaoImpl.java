package br.com.hibernate.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.hibernate.dao.LivroDao;
import br.com.hibernate.model.Livro;
import br.com.hibernate.utils.HibernateUtil;

/**@
 * 
 * @author Anderson Gomes
 *
 */

public class LivroDaoImpl implements LivroDao {
	
	public void save(Livro livro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(livro);
		t.commit();
	}

	public Livro getLivro(long id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		return (Livro) session.load(Livro.class, id);
	}

	public List<Livro> list() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		
		@SuppressWarnings("unchecked")
		List<Livro> lista = session.createQuery("from Livro").list();
		t.commit();
		return lista;
	}

	public void remove(Livro livro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.delete(livro);
		t.commit();
	}

	public void update(Livro livro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.update(livro);
		t.commit();
	}
}
