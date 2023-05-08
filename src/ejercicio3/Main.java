package ejercicio3;

public class Main {

	public static void main(String[] args) {

		// Creamos los arrays segun el tipo de instalacion, de tamaño 3
		Edificio[] edificios = new Edificio[3];
		InstalacionDeportiva[] insdepor = new InstalacionDeportiva[3];

		// Asignamos a cada posicion del array edificios objetos con x caracteristicas y
		// de distintos tipos
		edificios[0] = new EdificioOficinas(6);
		edificios[1] = new Polideportivo("Polideportivo Urbión", 1000);
		edificios[2] = new EdificioOficinas(-1);

		// Asignamos a cada posicion del array insdepor objetos con x caracteristicas
		insdepor[0] = new Polideportivo("Campo de rosas", 250);
		insdepor[1] = new Polideportivo("Polideportivo Sevilla", -50);
		insdepor[2] = new Polideportivo("Polideportivo One Piece", 0);

		// Con un for each mostramos los valores de cada posicion del array
		for (Edificio valores : edificios) {
			System.out.println(valores.toString());
			System.out.println();
		}

		for (InstalacionDeportiva valores : insdepor) {
			System.out.println(valores.toString());
			System.out.println();
		}

	}

}
