package tierraDeFantasia;

public class Vertice<T> {

	private T dato;
	private Arista<T> siguiente;

	public Vertice(T dato) {
		// TODO Auto-generated constructor stub
		this.dato = dato;
	}

	 public T getDato() {
		// TODO Auto-generated method stub
		return dato;
	}

	public Arista<T> getSiguienteArista() {
		// TODO Auto-generated method stub
		return siguiente;
	}

	public void setSiguienteArista(Arista<T> arista) {
		// TODO Auto-generated method stub
		this.siguiente = arista;
		
	}

}
