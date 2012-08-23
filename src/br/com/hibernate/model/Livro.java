package br.com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Livro {

	@Id
	@GeneratedValue 
	private long id;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="autor")
	private String autor;
	
	@Column(name="paginas")
	private int paginas;
	
	@Column(name="editora")
	private String editora;
	
	@Column(name="isbn")
	private String isbn;
	
	@Column(name="avaliacao")
	private int avaliacao;

	public Livro() {
	}

	public Livro(long id, String titulo, String autor, int paginas,
			String editora, String isbn, int avaliacao) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.editora = editora;
		this.isbn = isbn;
		this.avaliacao = avaliacao;
	}

	//Getters and Setters
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

	public long getId() {
		return id;
	}
	
	
}
