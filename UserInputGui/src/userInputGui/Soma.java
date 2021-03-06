package userInputGui;

/*A classe soma herda a classe Operations
 * Portanto � considerada classe filha de Operations
 * */

public class Soma extends Operations {
	// Essa clasee herda o number1 e number2 de Operations.

	// � poss�vel criar novos atributos que apenas estar�o na classe filha.
	
	private int number3;
	
	// Construtor

	public Soma(int number1, int number2, int number3) {
		// esse comando chama o construtor da classe m�e, no caso o contrutor de
		// operations.
		super(number1, number2);
		this.number3 = number3;
	}

	// Override - Sobrescrever - N�o herdar um determinado membro.

	public int performOperation() {

		return number1 + number2 + number3;
	}

}
