package cosasDeSuperClaseSubClase;

public class Beta extends Alfa {
	public void mensaje() {
		System.out.println("Soy un Beta");
	}

	public static void main(String[] args) {
		Alfa a = new Beta();
		Beta b = (Beta) a; //me deja xq en realidad a es un Beta
		a.mensaje();
		b.mensaje();
		
		System.out.println("\n\n\n");
		
		
		Alfa a2 = new Alfa();
		Beta b2 = (Beta) a2; //error Exception in thread "main"
		a2.mensaje();
		b2.mensaje();
		
	}
}
