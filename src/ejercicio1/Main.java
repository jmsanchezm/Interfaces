package ejercicio1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		//Creo el primer objeto a comparar
		Socio soc1 = new Socio (1,"Pepe",20);
		//Creo el segundo objeto a comparar
		Socio soc2 = new Socio (0,"Rosa",45);
		
		//Creo el array de objetos de tamaño 3
		Socio [] lista= new Socio [3];
		
		//Introduzco datos para cada posicion del array, creando un objeto
		lista[0]= new Socio (3,"Mar",32);
		lista [1]= new Socio (9,"Mario", 55);
		lista[2]= new Socio (5,"Alfredo",45);
		
		//Comprobamos que el metodo compareTo funciona
		System.out.println(soc1.compareTo(soc2));
		System.out.println(soc1.compareTo(soc1));
		System.out.println(soc2.compareTo(soc1));

		//Ordenamos el array
		Arrays.sort(lista);
		
		//Muestro el array y compruebo que esta ordenado correctamente
		for (int i = 0 ; i < lista.length;i++) {
			System.out.println(lista[i].toString());
		}
	}

}
