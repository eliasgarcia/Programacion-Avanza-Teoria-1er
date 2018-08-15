package llamandoAtributosDeSuperClase;

public class Cougar extends Feline{
	
//	String type = "coug"; 
	
	public Cougar(){
		System.out.println("cougar");
	}
	
	public static void main(String[] args) {
		new Cougar().go();
	}
	
	void go(){
		type= "c";
		System.out.println(type + " " +this.type + " " + super.type);
		//como "type" es publica del Padre ---> la estoy modificando tmb,
		//this.type y super.type son iguales!
		
		//en caso de que esta clase tenga creado el atributo "type".. ahi si seran dif..
	}
}
