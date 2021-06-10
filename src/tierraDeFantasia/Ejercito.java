package tierraDeFantasia;

import java.util.PriorityQueue;

public class Ejercito extends Guerrero{

	private PriorityQueue<Guerrero> ejercito = new PriorityQueue<Guerrero>();
	
	/*
	 * Constructor Necesario porque daba error al agregar un ejercito
	 * por carecer este mismo de salud
	 */
	public Ejercito() {
		setSalud(Integer.MAX_VALUE);
	}
	

	public void agregar(Guerrero guerrero) {
		// TODO Auto-generated method stub
		ejercito.add(guerrero);
		
	}

	public Guerrero listarSiguiente() {
		// TODO Auto-generated method stub
		return ejercito.peek();
	}

	public Guerrero obtenerSiguiente() {
		// TODO Auto-generated method stub
		return ejercito.poll();
	}

	@Override
	protected boolean atacar(Guerrero guerrero) {
		// TODO Auto-generated method stub
		return false;
	}
	
	/*
	 * obtener() es un metodo en comun para que funcione el composite
	 * Debe tener uno la clase raza,
	 * En la clase raza:
	 * 	protected Guerrero obtener() {
	 * return this;
	 *	}
	 */
	public Guerrero obtener() {
		// TODO Auto-generated method stub
		if(!ejercito.isEmpty()) {
			return ejercito.poll().obtener();
				
		}
		return null;
	}
	
	public Guerrero[] toArray() {
		
		Guerrero[] guerreros = new Guerrero[ejercito.size()];
		int i = 0;

		while(!ejercito.isEmpty()) {
			guerreros[i++] = obtener();
		}
		
		return guerreros;
		
	}
	


}
