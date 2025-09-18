package exercicio10_arraylist;

import java.util.ArrayList;

public class Main10 {
	
	public static void main(String[] args) {
		ArrayList<String> nome = new ArrayList<String>();
		nome.add("Joao");
		nome.add("Maria");
		nome.add("Marco");
		nome.add("Luana");
		
		System.out.println(invertArray(nome));

	}
	public static ArrayList<String> invertArray(ArrayList<String> nome){
		ArrayList<String> reverso = new ArrayList<String>();
		
			for(int i = nome.size() - 1; i >= 0; i--) {
				reverso.add(nome.get(i));
			}
			
		return reverso;
	}


}
