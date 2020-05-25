package retangulo;

public class Point {
	private int x, y;

	public Point() {
		this.x = 0;
		this.y = 0;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/* Criar um método get para que outras classes tenham acesso a essa */
	/*Utilizado para retornar os valores de um atributo
	 * Quando voce usa o get voce pega o valor e salva ele em outro local da memória
	 */

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	/*Para poder atualizar o estado de um objeto, utiliza-se os métodos modificadores
	 * Para tanto utiliza-se o set
	 * Utilizado para atualizar um valor de um atributo
	 * */
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	public String toString() {
		return "Point("+x+","+y+")";
	}

}
