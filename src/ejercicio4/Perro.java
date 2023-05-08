package ejercicio4;

public class Perro extends AnimalDomestico {

	/**
	 * Método que emite el sonido del perro
	 */
	@Override
	public void hacerRuido() {
		System.out.println("Guau");

	}

	/**
	 * Método que determina que el perro te haga caso
	 */
	@Override
	public boolean hacerCaso() {
		boolean res = false;
		//Si el numero generado ese menor o igual a 0.9
		if (Math.random() <= 0.9) {
			//res se tornara true
			res = true;
		}
		return false;
	}

	/**
	 * Método que dice si ha sacado el perro a pasear
	 */
	public void sacarPaseo() {
		System.out.println("Se ha sacado el perro a pasear");
	}
}
