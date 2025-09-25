package exercicio1_arraylist_composicao_agregacao_refaccao;

import aula8_arraylist_agregacao_composicao.Biblioteca;
import aula8_arraylist_agregacao_composicao.Livro;

public class Main {
	
	//AGREGAÇÃO
		public static void main(String[] args) {
			
			Livro l1 = new Livro();
			l1.setAutor("João");
			l1.setTitulo("João e Maria");
			l1.setAnoPublicacao(2025);
			
			Livro l2 = new Livro();
			l2.setAutor("Maria");
			l2.setTitulo("Maria e João");
			l2.setAnoPublicacao(2024);
			
			Biblioteca b1 = new Biblioteca();
			b1.setNome("Biblioteca do João");
			b1.getLivros().add(l1); //LISTA gerada pelo atributo privado da classe livro;
			b1.getLivros().add(l2);
			
			for(Livro l : b1.getLivros()) {
				System.out.println(l.getAnoPublicacao());
			}
			
		}

}

