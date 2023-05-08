package ejercicio3;

public class Polideportivo implements InstalacionDeportiva, Edificio {

	/**
	 * Se guardara la superficie del polideportivo
	 */
	protected double superficie = 100;
	/**
	 * Se guardara el nombre del polideportivo
	 */
	protected String nombre = " ";

	/**
	 * Constructor con parametros
	 * @param nombre
	 * @param superficie
	 */
	public Polideportivo( String nombre, double superficie) {
		super();
		//Si el valor de la superficie es mayor a 0
		if (superficie > 0) {
			this.superficie = superficie;
		}
		this.nombre = nombre;
	}

	@Override
	public double getSuperficieEdificio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTipoDeInstalacion() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return "Polideportivo= "+  nombre  + "\nSuperficie= " + superficie;
	}

}
