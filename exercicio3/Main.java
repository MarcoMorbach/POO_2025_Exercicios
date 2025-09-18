package exercicio3;

public class Main {

	public static void main(String[] args) {
		
		Professores p1 = new Professores();
		p1.setNome("João");
		p1.setEspecialidade("Professor de Algebra");
		
		Departamento d1 = new Departamento();
		d1.setTipo("Departamento de professores");
		d1.setProfessor(p1);
		
		String nomeUniversidade = "UniCEUB";
				
		Universidade u1 = new Universidade(nomeUniversidade, d1);
		
		System.out.println(u1.getDep().getProfessor().getEspecialidade());

	}

}
