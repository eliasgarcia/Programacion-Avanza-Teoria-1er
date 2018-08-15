package puntosX_Y_Z;

public class Punto3D extends Punto2D {
	private int z;

	public Punto3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	@Override
	public String toString() {
		return "Punto3D [z=" + z + "]" + super.toString();
	}

	public static void main(String[] args) {
		Punto2D p2D = new Punto2D(1, 2);
		Punto3D p3D = new Punto3D(3, 4, 5);

		System.out.println("p2D = " + p2D);
		System.out.println("p3D = " + p3D);

		p2D = new Punto3D(6, 7, 8);
		System.out.println("p2D = " + p2D);

		p3D = (Punto3D) p2D; //imprime x y z
		System.out.println("p3D = " + p3D);
		
//		p3D = p2D; //no dja
//		System.out.println("hard....p3D = " + p3D);

		p3D = (Punto3D) new Punto3D(1, 1, 1);
		System.out.println("p3D = " + p3D);

		p3D = (Punto3D) new Punto2D(1, 1); // error por perdida
															// de info
		System.out.println("p3D = " + p3D);

	}
}
