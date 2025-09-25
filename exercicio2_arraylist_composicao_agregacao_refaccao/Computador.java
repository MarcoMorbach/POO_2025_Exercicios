package exercicio2_arraylist_composicao_agregacao_refaccao;

import java.util.ArrayList;

public class Computador {
	
	private Processador processador;
	private ArrayList<MemoriaRAM> memoria = new ArrayList<MemoriaRAM>();
	
	public Computador(ArrayList<MemoriaRAM> memoria, Processador processador) {
		this.memoria = memoria;
		this.processador = processador;
	}
	
	public Processador getProcessador() {
		return processador;
	}
	public void setProcessador(Processador processador) {
		this.processador = processador;
	}
	public ArrayList<MemoriaRAM> getMemoria() {
		return memoria;
	}
	public void setMemoria(ArrayList<MemoriaRAM> memoria) {
		this.memoria = memoria;
	}
	public void exibirDetalhes() {
		System.out.println(this.processador.getFrequencia());
		System.out.println(this.processador.getMarca());
		for(MemoriaRAM m : memoria) {
			System.out.println(m.getTipo());
			System.out.println(m.getCapacidade());
			
		}
	}
	
	

}
