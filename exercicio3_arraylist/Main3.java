package exercicio3_arraylist;

import java.util.ArrayList;

public class Main3 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		array1.add(1);
		array1.add(2);
		array1.add(3);
		
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		array2.add(3);
		array2.add(4);
		array2.add(5);
		
		System.out.println(arrayUnico(array1,array2));
	}
	
	public static ArrayList<Integer> arrayUnico(ArrayList<Integer> array1, ArrayList<Integer> array2){
		
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		
		for(Integer i : array1) {
			
			if(!array2.contains(i)) {
				resultado.add(i);
			}
		}
		for(Integer j : array2) {
			
			if(!array1.contains(j)) {
				resultado.add(j);
			}
		}
		return resultado;
	}


}
