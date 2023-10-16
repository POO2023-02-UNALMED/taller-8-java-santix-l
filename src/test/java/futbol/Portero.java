package futbol;

public class Portero extends Futbolista{
	
	public short golesRecibidos;
	
	public byte dorsal;
	
	public Portero() {
		super();
		this.golesRecibidos = 289;
		this.dorsal = 7;
	}

	public Portero(String nombre, int edad, short golesMarcados, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesMarcados;
		this.dorsal = dorsal;
	}
	
	public int compareTo(Object o) {
		
		
		int x = this.golesRecibidos - ((Portero)o).golesRecibidos;
		
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
		return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() + " con el dorsal " + this.dorsal + ". Le han marcado " + golesRecibidos;
	}



}



