package exercicio3;

public class Universidade {
	
	private String nomeUniversidade;
	private Departamento dep;
	
	public Universidade(String nomeUniversidade, Departamento dep) {
		this.dep = dep;
		this.nomeUniversidade = nomeUniversidade;
	}
	public String getNome() {
		return nomeUniversidade;
	}
	public void setNome(String nomeUniversidade) {
		this.nomeUniversidade = nomeUniversidade;
	}
	public Departamento getDep() {
		return dep;
	}
	public void setDep(Departamento dep) {
		this.dep = dep;
	}
	
	

}
