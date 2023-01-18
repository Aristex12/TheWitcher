package witcher;

public class Witcher {

	private String name;
	private int vidas;
	private boolean hasSoul;
	
	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}
	
	public int getVidas() {
		return vidas;
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

}
