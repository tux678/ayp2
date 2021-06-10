package tierraDeFantasia;


public abstract class  Guerrero implements Comparable<Guerrero> {

	private boolean estaDesmayado;
	protected Integer salud;


	protected abstract boolean atacar(Guerrero guerrero);
	
	protected void setDesmayado() {
		// TODO Auto-generated method stub
		estaDesmayado = true;
	}

	protected boolean estaDesmayado() {
		return estaDesmayado;
		
	}

	public Integer getSalud() {
		// TODO Auto-generated method stub
		return salud;
	}
	
	protected void setSalud(int salud) {
		// TODO Auto-generated method stub
		this.salud = salud;
	}
	
	@Override
	public int compareTo(Guerrero o) {
		// TODO Auto-generated method stub
		return this.getSalud().compareTo(o.getSalud());
	}

	protected abstract Guerrero obtener();

}
