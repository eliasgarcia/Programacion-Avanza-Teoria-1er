package sinSobreescribirGetType;

public class Gamma extends Beta {
//	String getType(){
//		return "gamma";
//	};
	
	
	public static void main(String[] args) {
/* TODO: No se puede hacer esto, no puedo asignar una Superclase a una Subclase !!!*/
//		Gamma g1 = new Alpha(); //Alfa no es un Gamma
//		Gamma g2 = new Beta(); //Beta no es un Gamma
//		System.out.println(g1.getType() + " "+ g2.getType());
//		No compila!!	
		
		
		Alpha a1 = new Gamma();
		Alpha a2 = new Beta();
		Beta b1 = new Gamma();
		System.out.println(a1.getClass() + " "+ a2.getClass() + " "+ b1.getClass());

	}
}
