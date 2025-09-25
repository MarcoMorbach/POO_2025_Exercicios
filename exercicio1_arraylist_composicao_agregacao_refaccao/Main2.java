package exercicio1_arraylist_composicao_agregacao_refaccao;

import java.util.ArrayList;

import aula8_arraylist_agregacao_composicao.Biblioteca;
import aula8_arraylist_agregacao_composicao.Livro;

public class Main2 {
	
		//COMPOSIÇÃO
		public static void main(String[] args) {
			
			Livro l1 = new Livro();
			l1.setAutor("João");
			l1.setTitulo("João e Maria");
			l1.setAnoPublicacao(2025);
			
			Livro l2 = new Livro();
			l2.setAutor("Maria");
			l2.setTitulo("Maria e João");
			l2.setAnoPublicacao(2024);
			
			ArrayList<Livro> ls  = new ArrayList<Livro>();
			ls.add(l1);
			ls.add(l2);
			
			Biblioteca b1 = new Biblioteca(ls);
			b1.setNome("Biblioteca do João");
		
			for(Livro l : ls) {
				System.out.println(l.getAnoPublicacao());
			}
			
		}

}



