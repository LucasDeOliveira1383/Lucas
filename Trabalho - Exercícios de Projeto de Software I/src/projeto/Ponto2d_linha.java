package projeto;

public class Ponto2d_linha {
	private Ponto2d a;
	private Ponto2d b;
	
	public Ponto2d_linha() {
		a = new Ponto2d;
		b = new Ponto2d;
	}
	
	public Linha(Ponto2d a, Ponto2d b) {
		this.a = new Ponto2d(a.getX(), a.getY());
		this.b = new Ponto2d(b.getX(), b.getY());
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public Ponto2d getA() {
		return new Ponto2d(a.getX(), a.getY());
	}
	
	public void setA(Ponto2d a) {
		this.a = a;
	}
	
	public Ponto2d getB() {
		return new Ponto2d(b.getX(), b.getY());
	}
	
	public void setB(Ponto2d b) {
		this.b = b;
	}
	
	public Ponto2d

}
