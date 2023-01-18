package witcher;

public class Witcher {

	private String name;
	private int vidas;
	private int daño;
	private boolean hasSoul;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getVidas() {
		return vidas;
	}
	
	public int getDaño() {
		return daño;
	}

	public void setDaño(int daño) {
		this.daño = daño;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	public boolean isHasSoul() {
		return hasSoul;
	}
	
	public void setHasSoul(boolean hasSoul) {
		this.hasSoul = hasSoul;
	}
	
	
	public boolean isDead() {
		if(vidas == 0) {
			return true;
		} else if(!hasSoul) {
			return true;
		} else {
			return false;
		}
	}
	public void reciveDamage(int damage){
		vidas -=damage;
		if(vidas < 0) vidas = 0;
	}

}
