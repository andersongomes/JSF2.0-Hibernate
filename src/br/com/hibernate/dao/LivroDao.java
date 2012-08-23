package br.com.hibernate.dao;

import java.util.List;

import br.com.hibernate.model.Livro;

public interface LivroDao {
	public void save(Livro livro);
	public Livro getLivro(long id);
	public List<Livro> list();
	public void remove(Livro livro);
	public void update(Livro livro);
}
