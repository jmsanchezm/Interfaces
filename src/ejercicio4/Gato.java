package ejercicio4;

public class Gato extends AnimalDomestico {

	/**
	 * Método que emite el sonido especifico del gato
	 */
	@Override
	public void hacerRuido() {
		System.out.println("Miau");

	}

	/**
	 * Método que determina si el gato te hace caso
	 */
	@Override
	public boolean hacerCaso() {
		boolean res = false;
		//Si el número generado es menor a 0.05
		if (Math.random() <= 0.05) {
			//res se tornara true
			res = true;
		}
		return res;
	}

	/**
	 * Método que dice que el gato ha tosido una bola de pelo
	 */
	public void toserBolaPelo() {
		System.out.println("El gato ha tosido la bola de pelo");
	}
}
