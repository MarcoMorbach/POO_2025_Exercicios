package exercicio6_arraylist;

import java.util.ArrayList;

public class Main6 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numInt = new ArrayList<Integer>();
		numInt.add(2);
		numInt.add(3);
		numInt.add(4);
		numInt.add(1);
		numInt.add(6);
		
		System.out.println(removePar(numInt));
	}
	public static ArrayList<Integer> removePar(ArrayList<Integer> numInt){
		ArrayList<Integer> impar = new ArrayList<Integer>();
		for(Integer i : numInt) {
			if(i % 2 != 0) {
				impar.add(i);
			}
		}
		return impar;
	}


}
