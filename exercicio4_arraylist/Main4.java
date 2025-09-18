package exercicio4_arraylist;

import java.util.ArrayList;

public class Main4 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(25);
		array.add(30);
		array.add(1);
		array.add(20);
		
		System.out.println(indiceMenor(array));
		

	}
	public static int indiceMenor(ArrayList<Integer> array) {
		
		int menor;
		int indmenor = 0;
		menor = array.get(0);
		for(int i = 1; i < array.size(); i++) {
			if(array.get(i) < menor) {
				menor = array.get(i);
				indmenor = i;
			}
		}
		return indmenor;
	}



}
