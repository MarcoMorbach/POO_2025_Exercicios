package exercicio5_arraylist;

import java.util.ArrayList;

public class Main5 {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("João");
		name.add("Maria");
		name.add("João");
		
		System.out.println("Verificação de ocorrências do nome João");
		System.out.println(numOcorrencias(name));
	}
	public static int numOcorrencias(ArrayList<String> name) {
		int ocorrencias = 0;
		int k = 0;
		for(int i = 0; i < name.size(); i++) {
			for(int j = 0; j < name.size() - 1; j++) {
				if(name.get(i) != name.get(j)) {
					
				}
				else {
					k++;
					ocorrencias = k - 1; // -1 pois é a comparação da string na mesma posição dela
					
				}
			}
		}
		return ocorrencias;
	}

}
