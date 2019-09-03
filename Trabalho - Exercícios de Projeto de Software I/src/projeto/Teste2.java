package projeto;

public class Teste2 {
	
	public static void main(String[] args) {
		Ponto2d p1 = new Ponto2d();
		Ponto2d p2 = new Ponto2d();
		Ponto2d p3 = null;
		Ponto2d p4 = new Ponto2d();
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.printf("(%d, %d)\n", p1.getX(), p1.getY());
		System.out.printf("(%d, %d)\n", p2.getX(), p2.getY());
		
		System.out.println("p1 está no " + p1.quadrante());
		System.out.println("p2 está no " + p2.quadrante());
		
		System.out.printf("A distância entre p1 e p2 é %f", p1.distancia(p2));
		
		System.out.println("p1 e p2 sao " + (p1.equals(p2) ? "iguais" : "diferentes"));
		System.out.println("p1 e p1 sao " + (p1.equals(p1) ? "iguais" : "diferentes"));
		System.out.println("p1 e p3 sao " + (p1.equals(p3) ? "iguais" : "diferentes"));
		System.out.println("p1 e p4 sao " + (p1.equals(p4) ? "iguais" : "diferentes"));
		System.out.println(p1.ObjectToString());
		System.out.println();
	}
	
}
