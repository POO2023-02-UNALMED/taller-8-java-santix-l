package futbol;

public class Jugador extends Futbolista {
	
	public short golesMarcados;
	
	public byte dorsal;
	
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}

	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}

	@Override
	public int compareTo(Object o) {
		
		
		int x = this.getEdad() - ((Jugador)o).getEdad();
		
		if(x < 0) {
			
			return x - (2*x);
		}
		
		else {
			return x;
		}
	}


	@Override
	public boolean jugarConLasManos() {
		
		if(getPosicion() != "Portero") {
			return false;
		}
		
		else {
			return true;
		}
		
	}
	
	public String toString() {
		return "El Futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() + " con el dorsal " + this.dorsal + ".Ha marcado" + golesMarcados;
	}


}
