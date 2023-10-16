package futbol;

public abstract class Futbolista implements Comparable<Object>{
	
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista(){
		
		this("Maradona", 30, "delantero");
	}
	
	public Futbolista(String nombre, int edad, String posicion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	
	
	public abstract boolean jugarConLasManos();
	
	
	public boolean equals(Futbolista f) {
		
		if(this == f) {
				return true;
					
		}
		
		else {
			
			return false;
		}
	}
	

	@Override
	public String toString() {
		return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPosicion() {
		return posicion;
	}

	
	
	
	

}
