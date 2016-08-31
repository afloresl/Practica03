import java.util.concurrent.ThreadLocalRandom;
/**
* Clase para crear un jugador con sus cartas y nivel de vida.
*/
public class Jugador {
	//La raza a la que pertenecera el personaje del jugador.
	String tipo_de_jugador;
	//El número de cartas del jugador.
	int mazo;
	//El nivel de vida del jugador.
	int puntos_de_vida;
	//El nivel maximo de vida que puede alcanzar el personaje.
	int max_vida;
	//El nivel minimo de vida que puede alcanzar el personaje.
	int min_vida;

	/**
	* Constructor.
	* @param tipo_de_jugador La raza a la que pertenecera el personaje del jugador.
	* @param mazo El número de cartas del jugador.
	* @param puntos_de_vida Los puntos de vida del jugador.
	*/
	public Jugador(String nombre, int mazo, int max_vida, int min_vida) {
		this.nombre = nombre;
		this.mazo = mazo;
		puntos_de_vida = crear_vida(max_vida, min_vida);
	}

	/**
	* Método para generar los puntos de vida del personaje,
	* este se asignara en un rango de min_vida a max_vida
	* los cuales dependen del tipo de personaje.
	*/
	private crear_vida(int max_vida, int min_vida) {
		puntos_de_vida = ThreadLocalRandom.current().nextInt(min_vida, max_vida);
		return puntos_de_vida;
	}
}
