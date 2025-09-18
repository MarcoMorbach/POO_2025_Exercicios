package exerecicio2;

public class Main {

	public static void main(String[] args) {
		
		Processador p1 = new Processador();
		p1.setMarca("Intel");
		p1.setFrequencia("4.5Ghz");
		
		MemoriaRAM ram1 = new MemoriaRAM();
		ram1.setCapacidade("8GB");
		ram1.setTipo("DDR4");
		
		Computador c1 = new Computador(p1, ram1);
		
		c1.exibirDetalhes();
		

	}

}
