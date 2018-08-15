package buscadorMedio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuscadorMedio {

	private int buscadorDePico(int [] vector) {
		int medio = vector.length/2;
		if(vector[medio]>vector[medio-1] && vector[medio]>vector[medio+1]) {
			return vector[medio];
		}else if(vector[medio]>vector[medio-1]) {
			return buscadorDePico(Arrays.copyOfRange(vector, medio, vector.length+1));
		}else {
			return buscadorDePico(Arrays.copyOfRange(vector, 0, medio+1));
		}
	}
	
	public static void main(String[] args) {
		int[] vector = {1,11,7,6,5,4,3,2,1};
		BuscadorMedio bm = new BuscadorMedio();
		System.out.println(bm.buscadorDePico(vector));
		List<String> lista = new ArrayList<>();
		lista.subList(0, 4);
	}
}
