package retangulo;

/*Classe demonstrativa de como utilizar sobrecarga em java*/
public class A {
	/* Poliformismo - mesmo nome associado a c�digos diferentes */
	public void sobrecarga() {

	}

	public void sobrecarga(boolean p) {

	}

	public void sobrecarga(boolean a, boolean b) {

	}

	public void sobrecarga(boolean a, int b) {

	}

	public void sobrecarga(int a, boolean b) {

	}

	// parametros "infinitos"
	// a vari�vel a � um built-in array, ou seja � poss�vel acessa-lo utilizando []
	public void sobrecarga(int... a) {

	}
}
