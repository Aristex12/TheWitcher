package witcher;

public class Main {

	public static void main(String[] args) {
		
		Witcher brujo = new Witcher();
		
		brujo.setName("Gerarlt de Rivia");
		brujo.setVidas(15);
		brujo.setHasSoul(true);
		
		if(brujo.isDead()) {
			System.out.println(brujo.getName() + " esta muerto");
		} else {
			System.out.println(brujo.getName() + " esta vivo");
		}

	}
	
}
