package tierraDeFantasia;

public class Nortaichian extends Raza {

	private static final int ATAQUE_BASICO = 18;
	
	public Nortaichian() {
		setSalud(66);
	}

	@Override
	protected void recibirDanio(int ataque) {
		// TODO Auto-generated method stub
		this.setAtacado();
		setSalud(this.getSalud() - ataque);
		if(getSalud() <= 0)
			this.setDesmayado();

	}



	private void setAtacado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean atacar(Guerrero adversario) {
		// TODO Auto-generated method stub
		((Raza) adversario).recibirDanio(ATAQUE_BASICO);
		return true;
	}

}
