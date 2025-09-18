package exercicio1;

public class Main {
	
	public static void main(String[] args) {
		
		Biblioteca b1 = new Biblioteca();
		b1.setNome("Biblioteca Joao Herculino");
		
		Livro l1 = new Livro();
		l1.setAutor("João");
		l1.setTitulo("Livro do João");
		l1.setAnoPublicacao(2025);
		
		b1.setLivro(l1); // AGREGAÇÂO: pois a classe biblioteca independe da classe livro
		
		System.out.println(b1.getNome() + " - " + 
							b1.getLivro().getAutor() + " - " +
							b1.getLivro().getTitulo() + " - " +
							b1.getLivro().getAnoPublicacao());
		
	}

}
