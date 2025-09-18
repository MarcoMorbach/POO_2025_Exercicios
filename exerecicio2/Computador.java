package exerecicio2;

public class Computador {
	
	private Processador processador;
	private MemoriaRAM RAM;
	
	public Computador(Processador processador, MemoriaRAM RAM) {
		this.processador = processador;
		this.RAM = RAM;
		
	}
	public Processador getProcessador() {
		return processador;
	}
	public void setProcessador(Processador processador) {
		this.processador = processador;
	}
	public MemoriaRAM getRAM() {
		return RAM;
	}
	public void setRAM(MemoriaRAM rAM) {
		RAM = rAM;
	}
	public void exibirDetalhes() { // REVISAR ATENÇÃO
		System.out.println(this.processador.getMarca());
		System.out.println(this.processador.getFrequencia());
		System.out.println(this.RAM.getCapacidade());
		System.out.println(this.RAM.getTipo());
	}
	
	

}
