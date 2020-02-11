package Test1;

public class Test {

	public static void main(String[] args) {

		DEF d = new DEF();
		d.add();

	}
}

class DEF {

	void add() {
		System.out.println("1111111111111111111");
	}

	DEF() {
		System.out.println("22222222222222222222222222222");
	}

	DEF(int x) {
		System.out.println("22222222222222222222222222222");
	}

	DEF(String t) {
		System.out.println("22222222222222222222222222222");
	}

	DEF(int x, String y) {
		System.out.println("22222222222222222222222222222");
	}

	DEF(String y, int f) {
		System.out.println("22222222222222222222222222222");
	}
}

class PQR extends DEF {

}
