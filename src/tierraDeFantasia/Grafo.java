package tierraDeFantasia;

public class Grafo<T> {


	private Vertice<T>[] vertices;
	private int ultimoDisponible = 0;
	
	@SuppressWarnings("unchecked")
	public Grafo() {
		vertices = (Vertice<T>[] ) new Vertice[10];
	}

	@SuppressWarnings("unchecked")
	public Grafo(Integer cantidadDePoblados) {
		// TODO Auto-generated constructor stub
		vertices = (Vertice<T>[] ) new Vertice[cantidadDePoblados];
	}

	public void agregar(T dato) {
		// TODO Auto-generated method stub
		this.vertices[this.getUltimo()] = new Vertice<T>(dato);
		this.setUltimo(this.getUltimo() + 1);
	}

	private void setUltimo(int i) {
		// TODO Auto-generated method stub
		this.ultimoDisponible = i;
	}

	private int getUltimo() {
		// TODO Auto-generated method stub
		return ultimoDisponible ;
	}

	public T getPrimero() {
		// TODO Auto-generated method stub
		return vertices[0].getDato();
	}

	public Integer getCosto( T verticeDestino) {
		return vertices[0].getSiguienteArista().getPeso();
		// TODO Auto-generated method stub
		
	}

	public void agregarArista(Vertice<T> verticeOrigen, Vertice<T> verticeDestino, Integer dias) {
		// TODO Auto-generated method stub
		Vertice<T> verticeO = this.buscar(verticeOrigen);
		Vertice<T> verticeD = this.buscar(verticeDestino);
		
		if( verticeO == null || verticeD == null)
			throw new VerticeNoExisteExceptions();
		
		if(verticeO.getSiguienteArista() == null )
			verticeO.setSiguienteArista(new Arista<T>(verticeO, verticeD, dias));
		
	}

	private Vertice<T> buscar(Vertice<T> vertice) {
		int i = 0;
		// TODO Auto-generated method stub
		while(i< vertices.length  && !vertices[i].equals(vertice))
			i++;
		if(i<vertices.length)
			return vertices[i];
		return null;
			
	}
}
