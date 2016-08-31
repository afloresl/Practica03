/**
* Clase Heroe, para crear un tipo de jugador.
*/
public class Heroe extends jugador {

	//El nivel maximo de vida que puede alcanzar el personaje.
	int max_vida = 14;
	//El nivel minimo de vida que puede alcanzar el personaje.
	int min_vida = 6;

	/**
	* Constructor.
	* @param nombre La raza a la que pertenecera el personaje del jugador.
	* @param mazo El número de cartas del jugador.
	* @param puntos_de_vida Los puntos de vida del jugador.
	*/
	public Jugador(int mazo) {
		super.Jugador("heroe", mazo, crear_vida(max_vida, min_vida));
	}		
}