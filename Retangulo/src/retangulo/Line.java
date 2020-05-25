package retangulo;

public class Line {

	private Point begin, end;

	public Line(int x1, int y1, int x2, int y2) {

		begin = new Point(x1, y1);
		end = new Point(x2, y2);

	}

	// Construtor
	public Line(Point begin, Point end) {
		this.begin = begin;
		this.end = end;
	}

	// O getter � um tipo point, porque o atributo begin � um ponto.
	public Point getBegin() {
		return begin;
	}

	public Point getEnd() {
		return end;
	}
	
	public void setBegin(Point begin) {
		this.begin=begin;
		
	}
	
	public void setEnd(Point end) {
		this.end=end;
	}
	
	/*� um m�todo pronto da biblioteca, caso voce utilize o system.out.prinln e deseje ver o que est� nessa classse, ela precisa possuir esse m�todo*/
	public String toString() {
		return"Linebegin="+begin+"end="+end;
	}
	
}
