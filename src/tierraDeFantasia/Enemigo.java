package tierraDeFantasia;

public class Enemigo extends Raza {
	
	private static final int ATAQUE_BASICO = 40;


	public Enemigo() {
		
		setSalud(300);
	}


	@Override
	protected void recibirDanio(int ataque) {
		// TODO Auto-generated method stub
		setSalud(this.getSalud() - ataque );
		if(getSalud() <= 0)
			this.setDesmayado();

	}


	@Override
	protected boolean atacar(Guerrero enemigo) {
		// TODO Auto-generated method stub
		
		((Raza) enemigo).recibirDanio(ATAQUE_BASICO);
		return true;
	}
	
	

}
