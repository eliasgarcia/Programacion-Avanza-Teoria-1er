import java.util.Arrays;

public class Final {

	public int[] buscarNMinimos(int[] vector, int minimo) {
		boolean flag = true;
		while (flag) {
			flag = false;
			for (int i = 0; i < vector.length - 1; i++) {
				if (vector[i] > vector[i + 1]) {
					int aux = vector[i];
					vector[i] = vector[i + 1];
					vector[i + 1] = aux;
					flag = true;
				}
			}
		}
		return Arrays.copyOfRange(vector, 0, minimo);// Arrays.copyOfRange(vector, 0, 1);
	}
	
	public static void main(String[] args) {
		Final f= new Final();
		int[] vec = {9,8,6,7,5,4,3,2,1,0};
		int[] vect=				f.buscarNMinimos(vec, 4);
		System.out.println();
	}
}
