package br.com.hibernate.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import br.com.hibernate.dao.LivroDao;
import br.com.hibernate.dao.impl.LivroDaoImpl;
import br.com.hibernate.model.Livro;

@ManagedBean
@SessionScoped
public class LivroController {

    private Livro livro;
    
    @SuppressWarnings("rawtypes")
	private DataModel listaLivros;

    @SuppressWarnings({ "rawtypes", "unchecked" })
	public DataModel getListarLivros() {
        List<Livro> lista = new LivroDaoImpl().list();
        listaLivros = new ListDataModel(lista);
        return listaLivros;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String prepararAdicionarLivro(){
        livro = new Livro();
        return "gerenciarLivro";
    }

    public String prepararAlterarLivro(){
        livro = (Livro)(listaLivros.getRowData());
        return "gerenciarLivro";
    }

    public String excluirLivro(){

        Livro livroTemp = (Livro)(listaLivros.getRowData());
        LivroDao dao = new LivroDaoImpl();
        dao.remove(livroTemp);
        return "index";

    }

    public String adicionarLivro(){

        LivroDao dao = new LivroDaoImpl();
        dao.save(livro);
        return "index";
        
    }

    public String alterarLivro(){

        LivroDao dao = new LivroDaoImpl();
        dao.update(livro);
        return "index";

    }

}
