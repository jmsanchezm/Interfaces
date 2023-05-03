package ejercicio2;

public class Futbolista implements Comparable {

	/**
	 * Se guardará el numero de la camiseta
	 */
	int numCamiseta = 1;

	/**
	 * Se guardara el nombre del jugador
	 */
	String nombre = "";

	/**
	 * Se guardara la edad del futbolista
	 */
	int edad = 1;

	/**
	 * Se guardara el numero de goles
	 */
	int numGoles = 0;

	/**
	 * Constructor con parametros
	 * 
	 * @param numCamiseta
	 * @param nombre
	 * @param edad
	 * @param numGoles
	 */
	public Futbolista(int numCamiseta, String nombre, int edad, int numGoles) {
		super();
		if (numCamiseta > 0) {
			this.numCamiseta = numCamiseta;
		}
		if (edad > 0) {
			this.edad = edad;
		}
		if (numGoles > 0) {
			this.numGoles = numGoles;
		}
		this.nombre = nombre;
	}

	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return nombre + ", " + numCamiseta + ", " + edad + ", " + edad + ", " + numGoles;
	}

	/**
	 * Método equals
	 */
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	/**
	 * Método compareTo 
	 */
	public int compareTo(Object obj) {
		int result = 0;
		Futbolista futb = (Futbolista) obj;
		if (this.numCamiseta != futb.numCamiseta) {
			result = 1;
		} else if (this.nombre.equals(futb.nombre)) {
			result = 0;
		}
		return result;
	}

}
