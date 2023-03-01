package witcher;

/**
 * Clase que representa un brujo con 3 atributos --> name, vidas, dano
 * Esta clase se usara para un videojuego RPG.
 * 
 * @author Aris
 * @version 1.0
 * 
 */

public class Witcher {

	/**
	 * atributo name es el nombre del brujo
	 * 
	 */
	private String name;
	//vidas del brujo
	private int vidas;
	//dano que hace el brujo
	private int dano;
	//si el brujo tiene alma o no
	private boolean hasSoul;
	
	/**
	 * Esto es un getter para obtener el nombre del brujo
	 * @return devuelve una cadena de texto que es el nombre
	 */
	
	public String getName() {
		return name;
	}
	
	/**
	 * Esto es un setter que nos permite darle valor al nombre del brujo
	 * @param name Nombre del brujo
	 */

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Getter para obtener la cantidad de vidas del brujo
	 * @return Devuelve el número de vidas que le quedan al brujo
	 */
	
	public int getVidas() {
		return vidas;
	}
	
	/**
	 * setter que permite darle valor a vidas del brujo
	 * @param vidas Vidas del brujo
	 */
	
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	
	/**
	 * Getter que nos devuelve el dano que causa al brujo
	 * @return Devuelve el dano
	 */
	
	public int getDano() {
		return dano;
	}

	/**
	 * Setter que nos permite dar valor al dano que puede llegar a sufrir el brujo
	 * @param dano devuelve el dano
	 */
	
	public void setDano(int dano) {
		this.dano = dano;
	}

	/**
	 * Metodo que comprueba si el brujo tiene alma
	 * @return devuelve true or false
	 */
	
	public boolean isHasSoul() {
		return hasSoul;
	}

	/**
	 * 
	 * @param hasSoul
	 */
	
	public void setHasSoul(boolean hasSoul) {
		this.hasSoul = hasSoul;
	}
	
	/**
	 * Nos dice si el brujo esta muerto o no
	 * <ul>
	 * <li>Si no tiene vida</li>
	 * <li>Si tiene vida pero no tiene alma</li>
	 * </ul>
	 * @return si esta o no muerto
	 */
	
	public boolean isDead() {
		if(vidas == 0) {
			return true;
		} else if(!hasSoul) {
			return true;
		} else {
			return false;
		}
	}

}
