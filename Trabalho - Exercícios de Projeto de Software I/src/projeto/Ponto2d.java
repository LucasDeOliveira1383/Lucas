package projeto;

public abstract class Ponto2d extends FormaGeometrica {
	
	private int x;
	private int y;
	
	Ponto2d() {
		x = 0;
		y = 0;
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
	
	public String quadrante() {
		if(x > 0 && y > 0)
			return "I Quadrante";
		if(x < 0 && y > 0)
			return "II Quadrante";
		if(x < 0 && y < 0)
			return "III Quadrante";
		if(x > 0 && y < 0)
			return "IV Quadrante";
		return "Origem";
	}
	
	public float distancia(Ponto2d pt) {
		return (float) Math.sqrt((x-pt.x)*(x-pt.x)+(y-pt.y)*(y-pt.y));
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(!obj.getClass().equals(Ponto2d.class))
			return false;
		if(obj == this)
			return true;
		if(this.x != ((Ponto2d)obj).x)
			return false;
		if(this.y != ((Ponto2d)obj).y)
			return false;
		return true;
	}
	
}
