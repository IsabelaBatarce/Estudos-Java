package userInputGui;

/*Essa classe não possuí o método main, dessa forma não é possível acessá-a diretamente*/

public class Operations {
	/*A palavra private faz com que nenhuma outra classe possa alterar a estrutura de dados desta classe*/
	/*Atributos da classe:*/
	private int number1;
	private int number2;
	
	/*Para instancear a classe é necessário criar um objeto da mesma
	 *Esse objeto é conhecido como construtor 
	 * */
	
	//Construtor (sempre possuí o mesmo nome da classe)
	
	public Operations(int number1, int number2) {
		/*Para acessar o atributo é necessário utilizar a palavra this.*/
		/*O this.number1 recebe o valor dos parametros*/
		this.number1 = number1;
		this.number2 = number2;
		
	}
	
	/*Método é uma função que está dentro de uma classe*/
	
	/*Métodos que podem acessar os atributos dessa classe */
	public int soma() {
		//retorna a soma dos dois atributos
		return number1+number2;
		
	}
}
