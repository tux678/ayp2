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
		try {
			if(this.siguiente == null)
				throw new NoHayAristaExceptions();
		} catch (NoHayAristaExceptions e) {
			System.err.println(e);
		}
		return siguiente;
	}

}
