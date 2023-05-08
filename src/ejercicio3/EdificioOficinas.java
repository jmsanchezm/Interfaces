package ejercicio3;

public class EdificioOficinas implements Edificio {

	/**
	 * Se guardara el numero de oficinas que tiene
	 */
	int numOficinas = 1;

	/**
	 * Constructor con parametros
	 * @param numOficinas
	 */
	public EdificioOficinas(int numOficinas) {
		super();
		if (numOficinas > 0) {
			this.numOficinas = numOficinas;
		}
	}

	/**
	 * Getter
	 */
	@Override
	public double getSuperficieEdificio() {
		return 0;
	}

	/**
	 * Metodo toString
	 */
	@Override
	public String toString() {
		return "Edificio con numero de Oficinas= " + numOficinas;
	}

	
	
}
