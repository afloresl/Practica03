/**
* Clase para generar las cartas del jugador.
*/
public class Carta {
	//El nombre de la carta.
	private String nombre;
	//La imagen que se muestra en la carta.
	private String imagen;
	//private List<Habilidad> listaHabilidades;
	private String descripcion;
	private int ataque;
	private int defensa;
	private int nivel;

	/**
	* Constructor.
	*/
	public Carta(String nombre, String imagen, String descripcion, int nivel, int max_ataque, int min_ataque) {
		this.nombre = nombre;
		this.imagen = imagen;
		this.descripcion = descripcion;
		this.nivel = nivel;
		this.max_ataque = max_ataque;
		this.min_ataque = min_ataque;
	}

	/**
	* Método para generar un ataque de manera aleatoria entre un rango de min_ataque y 
	* max_ataque, según el nivel de la carta se le asignara un valor bonus al ataque.
	* @param max_ataque El maximo valor que puede alcanzar un ataque.
	* @param min_ataque El minimo valor que puede alcanzar un ataque.
	* @return ataque El valor del ataque.
	*/
	protected ataque(int max_ataque, int min_ataque, int nivel) {
		ataque = ThreadLocalRandom.current().nextInt(min_ataque, max_ataque);
		if (nivel <= 3){
			ataque += 1;
		} else if (nivel > 3 && nivel <= 7){
			ataque += 2;
		} else if (nivel > 7){
			ataque += 3;
		}
		return ataque;
	}

	/**
	* Método para generar la defensa, esta se asigna según el nivel de la carta,
	* sin embargo se bajaran puntos de defensa de manera aleatoria entre un rango 
	*de min_ataque y ataque.
	*/
	protected int defensa(int nivel, int ataque, int min_ataque){
		int aux = ThreadLocalRandom.current().nextInt(min_ataque, ataque);
		if (nivel <= 2){
			defensa = 5;
		} else if (nivel >= 3 && nivel < 6){
			defensa = 9 ;
		} else if (nivel >= 7){
			defensa =;
		}
		defensa -= aux;
		return defensa;
	}

	public String getNombre(){return nombre;}
	public void setNombre(String nuevoNombre){this.nombre = nuevoNombre;}
	
	public String getCoste(){return coste;}
	public void setCoste(String nuevoCoste){this.coste = nuevoCoste;}
	
	public String getImagen(){return imagen;}
	public void setImagen(String nuevoImagen){this.imagen = nuevoImagen;}
	
	public String getDescripcion(){return descripcion;}
	public void setDescripcion(String nuevoDescripcion){this.descripcion = nuevoDescripcion;}
	
	public int getAtaque(){return ataque;}
	public void setAtaque(int nuevoAtaque){this.ataque = nuevoAtaque;}
	
	public int getDefensa(){return defensa;}	
	public void setDefensa(int nuevoDefensa){this.defensa = nuevoDefensa;}
	
	public String toString(){ 
		return "Nombre: " + nombre + ", Coste: " + coste + ", Imagen: " + imagen + ", Descripcion: " + descripcion + ", Ataque: " + ataque + ", Defensa: " + defensa;
	}
	
	
	
}




