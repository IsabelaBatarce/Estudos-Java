package retangulo;

/*Classe demonstrativa de como utilizar sobrecarga em java*/
public class A {
	/* Poliformismo - mesmo nome associado a códigos diferentes */
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
	// a variável a é um built-in array, ou seja é possível acessa-lo utilizando []
	public void sobrecarga(int... a) {

	}
}
