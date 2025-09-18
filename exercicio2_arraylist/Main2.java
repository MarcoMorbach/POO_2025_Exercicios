package exercicio2_arraylist;

import java.util.ArrayList;

public class Main2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(1);
		num.add(1);
		num.add(1);
		num.add(2);
		num.add(3);
		
		System.out.println(numUnico(num));
	}
	
	public static int numUnico(ArrayList<Integer> num){
		
		ArrayList<Integer> armazena = new ArrayList<Integer>();
				
		for(int i = 0; i < num.size(); i++) {
			if(!num.contains(i)) {
				 armazena.add(i);
			}
		}
		return armazena.size();
	} 


}
