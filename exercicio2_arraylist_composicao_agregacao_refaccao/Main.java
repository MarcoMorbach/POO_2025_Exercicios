package exercicio2_arraylist_composicao_agregacao_refaccao;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Processador p1 = new Processador();
		p1.setFrequencia("4.5Ghz");
		p1.setMarca("Intel");
		
		MemoriaRAM m1 = new MemoriaRAM();
		m1.setCapacidade(8);
		m1.setTipo("DDR4");
		
		MemoriaRAM m2 = new MemoriaRAM();
		m2.setCapacidade(16);
		m2.setTipo("DDR5");
		
		ArrayList<MemoriaRAM> mem = new ArrayList<MemoriaRAM>();
		mem.add(m1);
		mem.add(m2);
		
		Computador c1 = new Computador(mem, p1);
		c1.exibirDetalhes();
		

	}

}
