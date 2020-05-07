package userInputGui;

/*A classe soma herda a classe Operations
 * Portanto é considerada classe filha de Operations
 * */

public class Soma extends Operations {
	// Essa clasee herda o number1 e number2 de Operations.

	// Construtor

	public Soma(int number1, int number2) {
		// esse comando chama o construtor da classe mãe, no caso o contrutor de
		// operations.
		super(number1, number2);
	}

	// Override - Sobrescrever - Não herdar um determinado membro.
	
	public int performOperation() {
		
		return number1+number2;
	}
	
}
