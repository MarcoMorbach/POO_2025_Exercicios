package exercicio1_refaccao_arraylist_agragacao_composicao;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Livro l1 = new Livro();
		l1.setAnoPublicacao(2025);
		l1.setAutor("Joao");
		l1.setTitulo("Joao e Maria");
		
		Livro l2 = new Livro();
		l2.setAnoPublicacao(2024);
		l2.setAutor("Maria");
		l2.setTitulo("Maria e Joao");
		
		ArrayList<Livro> listaLivros = new ArrayList<Livro>();
		listaLivros.add(l1);
		listaLivros.add(l2);
		
		Biblioteca b1 = new Biblioteca();
		b1.setNomeBiblioteca("Biblioteca do CEUB");
		b1.setLivro(listaLivros);;
		
		for(Livro l : b1.getLivro()) {
			System.out.println(l.getTitulo());
			
		}
	}

}
