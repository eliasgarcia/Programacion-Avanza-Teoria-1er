
public class Batman {
	Integer squares = 81;

	public static void main(String[] args) {
		new Batman().go();
	}

	void go() {
		incr(++squares);
		System.out.println(squares);
	}

	void incr(Integer squares) {
		squares += 10;
	}
	
	//sea int o Integer, siempre da 82.. a menos que sea otro objeto
}