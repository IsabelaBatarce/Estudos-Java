package userInputGui;

/*Essa classe n�o possu� o m�todo main, dessa forma n�o � poss�vel acess�-a diretamente*/

public class Operations {
	/*A palavra private faz com que nenhuma outra classe possa alterar a estrutura de dados desta classe*/
	/*Atributos da classe:*/
	private int number1;
	private int number2;
	
	/*Para instancear a classe � necess�rio criar um objeto da mesma
	 *Esse objeto � conhecido como construtor 
	 * */
	
	//Construtor (sempre possu� o mesmo nome da classe)
	
	public Operations(int number1, int number2) {
		/*Para acessar o atributo � necess�rio utilizar a palavra this.*/
		/*O this.number1 recebe o valor dos parametros*/
		this.number1 = number1;
		this.number2 = number2;
		
	}
	
	/*M�todo � uma fun��o que est� dentro de uma classe*/
	
	/*M�todos que podem acessar os atributos dessa classe */
	public int soma() {
		//retorna a soma dos dois atributos
		return number1+number2;
		
	}
}
