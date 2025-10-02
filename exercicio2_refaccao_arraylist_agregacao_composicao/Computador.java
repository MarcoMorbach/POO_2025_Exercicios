package exercicio2_refaccao_arraylist_agregacao_composicao;

import java.util.ArrayList;

public class Computador {
	
	private Processador processador;
	private ArrayList<MemoriaRAM> memoria = new ArrayList<MemoriaRAM>();
	
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
	
	

}
