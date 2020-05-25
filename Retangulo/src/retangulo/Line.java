package retangulo;

public class Line {

	private Point begin, end;

	public Line(int x1, int y1, int x2, int y2) {

		begin = new Point(x1, y1);
		end = new Point(x2, y2);

	}

	// Construtor
	public Line(Point begin, Point end) {
		// Errado, viola encapsulamento:
		/*
		 * this.begin = begin; this.end = end;
		 */
		// Correto:
		this.begin = new Point(begin.getX(), begin.getY());
		this.begin = new Point(end.getX(), end.getY());

	}

	// O getter é um tipo point, porque o atributo begin é um ponto.
	public int getBeginX() {
		return begin.getX();
	}

	public int getBeginY() {
		return begin.getY();
	}

	public int getEndY() {
		return end.getY();
	}

	public int getEndX() {
		return end.getX();
	}

	public void setBegin(Point begin) {
		this.begin = new Point(begin.getX(), begin.getY());

	}

	public void setEnd(Point end) {
		this.begin = new Point(end.getX(), end.getY());

	}

	/*
	 * É um método pronto da biblioteca, caso voce utilize o system.out.prinln e
	 * deseje ver o que está nessa classse, ela precisa possuir esse método
	 */
	public String toString() {
		return "Linebegin=" + begin + "end=" + end;
	}

}
