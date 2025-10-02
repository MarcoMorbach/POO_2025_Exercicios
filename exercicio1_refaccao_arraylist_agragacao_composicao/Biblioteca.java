package exercicio1_refaccao_arraylist_agragacao_composicao;

import java.util.ArrayList;

public class Biblioteca {
	
	private String nomeBiblioteca;
	private ArrayList<Livro> livro = new ArrayList<Livro>();
	
	public String getNomeBiblioteca() {
		return nomeBiblioteca;
	}
	public void setNomeBiblioteca(String nomeBiblioteca) {
		this.nomeBiblioteca = nomeBiblioteca;
	}
	public ArrayList<Livro> getLivro() {
		return livro;
	}
	public void setLivro(ArrayList<Livro> livro) {
		this.livro = livro;
	}
	
	
	
}
