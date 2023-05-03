package ejercicio2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		//Creamos el array de objetos
		Futbolista lista [] = new Futbolista[5];
		
		//Damos valores a los objetos de cada posicion
		lista [0]= new Futbolista (5,"Jose", 18,2);
		lista [1]= new Futbolista (9,"David", 21,8);
		lista [2]= new Futbolista (5,"Jose", 19,0);
		lista [3]= new Futbolista (15,"Jose", 25,6);
		lista [4]= new Futbolista (10,"Jose", 23,1);
		
		//Ordenamos el array
		Arrays.sort(lista);
		
		//Mostramos el contenido
		for (int i = 0; i< lista.length;i++) {
			System.out.println(lista[i].toString());
		}

	}

}
