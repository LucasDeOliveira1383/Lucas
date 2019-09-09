package ex_16_1;

public class NoLista {
	private NoLista proximo;
	private NoLista anterior;
	private Object obj;
	
	public NoLista() {
		this.proximo = null;
		this.anterior = null;
		this.obj = null;
	}
	
	public NoLista(NoLista proximo, NoLista anterior, Object obj) {
		this.proximo = proximo;
		this.anterior = anterior;
		this.obj = obj;
	}
	
	public NoLista getProximo() {
		return proximo;
	}
	
	public void setProximo(NoLista proximo) {
		this.proximo = proximo;
	}
	
	public NoLista getAnterior() {
		return anterior;
	}
	
	public void setAnterior(NoLista anterior) {
		this.anterior = anterior;
	}
	
	public Object getObj() {
		return obj;
	}
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
}
