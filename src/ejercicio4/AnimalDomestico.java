package ejercicio4;

public abstract class AnimalDomestico implements Animal {

	/**
	 * Se guardara el nombre del animal
	 */
	protected String nombre;
	/**
	 * Se guardara la raza del animañ
	 */
	protected String raza;
	/**
	 * Se guardara el color del animal
	 */
	protected String color;
	/**
	 * Se guardara el peso del animal
	 */
	protected double peso;

	/**
	 * Método que dice si el animal ha comido
	 */
	@Override
	public void comer() {
		System.out.println("El animal ha comido");
	}

	/**
	 * Método que emite el sonido del animal al dormir
	 */
	@Override
	public void dormir() {
		System.out.println("ZZZ");
	}

	/**
	 * Metodo que emite el sonido de cada animal
	 */
	@Override
	public abstract void hacerRuido();

	/**
	 * Metodo que determina si el animal hace caso
	 * @return
	 */
	public abstract boolean hacerCaso();

	/**
	 * Método que dice que el animal esta vacunado
	 */
	public void vacunar() {
		System.out.println("El animal está vacunado");
	}

	
}
