package exercicio1_arraylist_composicao_agregacao_refaccao;

import java.util.ArrayList;

public class Biblioteca {
	
	private String nome;
	private ArrayList<Livro> livros = new ArrayList<Livro>();
	
	public Biblioteca() {
		
	}
	public Biblioteca(ArrayList<Livro> livros) {
		this.livros = livros;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Livro> getLivros() {
		return livros;
	}
	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}

}
