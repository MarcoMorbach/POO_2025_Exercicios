package exercicios_arraylist;

import java.util.ArrayList;

public class Main1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(11);
		num.add(12);
		num.add(20);
		num.add(21);
		
		System.out.println(num.size());
		
		if(num.contains(11)) {
			System.out.println("O numero 11 esta na lista");
		}
		//MELHORAR
	}


}
