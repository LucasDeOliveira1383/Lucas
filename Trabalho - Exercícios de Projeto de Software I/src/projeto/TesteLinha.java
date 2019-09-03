package projeto;

public class TesteLinha {
	
	public static void main(String[] args) {
		Ponto2d_linha l1 = new Ponto2d_linha();
		Ponto2d_linha l2 = new Ponto2d_linha(new Ponto2d(1,1), new Ponto2d(3,5));
		
		System.out.println(l1);
		System.out.println("O centro de l1 é:" + l1.centro());
		System.out.println(l2);
		System.out.println("O centro de l2 é:" + l2.centro());
		
		System.out.printf("A distância entre l1 e l2 é %f", l1.distancia(l2));
		
		Ponto2d_linha l3 = new Ponto2d_linha();
		Ponto2d p1 = new Ponto2d();
		Ponto2d p2 = new Ponto2d(4,7);
		System.out.println(l3);
		l3.setA(p1);
		System.out.println(l3);
		l3.setB(p2);
		System.out.println(l3);
		
		p1.setX(1);
		Ponto2d_linha l4 = new Ponto2d_linha (p1, p2);
		
		System.out.println(l4);
		System.out.println(l3);
		
	}
	
}
