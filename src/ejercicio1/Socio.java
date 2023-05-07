package ejercicio1;

public class Socio implements Comparable {
	/**
	 * Se guardara el numero identificativo del socio
	 */
	int id = 0;
	/**
	 * Se guardara el nombre del socio
	 */
	String nombre = "";
	/**
	 * Se guardara la edad del socio
	 */
	int edad = 1;

	/**
	 * Constructor con parametros
	 * 
	 * @param id
	 * @param nombre
	 * @param edad
	 */
	public Socio(int id, String nombre, int edad) {
		super();
		if (id > 0) {
			this.id = id;
		}
		this.nombre = nombre;
		if (edad > 0) {
			this.edad = edad;
		}
	}

	/**
	 * Método compareTo para comparar dos objetos
	 * 
	 * @param obj
	 * @return
	 */
	public int compareTo(Object obj) {
		int result = 0;
		Socio soc = (Socio) obj;
		if (this.id > soc.id) {
			result = 1;
		} else if (this.id < soc.id) {
			result = -1;
		}
		return result;
	}
	
	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return id + " " + nombre + " " + edad;
	}



}
