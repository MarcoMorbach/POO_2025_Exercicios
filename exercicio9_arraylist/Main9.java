package exercicio9_arraylist;

import java.util.ArrayList;

public class Main9 {
	
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(10);
		num.add(20);
		
		System.out.println(calculaMedia(num));
	}
	
	public static double calculaMedia(ArrayList<Integer> num) {
		int media = 0;
		int resultado;
		for(Integer i : num) {
				media += i; // Acumulador
			}
		resultado = media/num.size();
		return resultado;
	}


}
