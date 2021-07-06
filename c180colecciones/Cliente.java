package c180colecciones;

public class Cliente {

	//campos de clase
	private String nombre;
	private String numCuenta;
	private double saldo;
	
	
	//constructor que de un estado inicial a los objetos del tipo cliente
	public Cliente(String nom, String nc, double sal) {
		
		nombre= nom;
		numCuenta=nc;
		saldo= sal;
		
	}

	//devolver la informacion almacenada en los campos de clase
	//eclipse-- source-- generate getters and setters
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNumCuenta() {
		return numCuenta;
	}


	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numCuenta == null) ? 0 : numCuenta.hashCode());
		return result;
	}

	
	//source, generate hashcode equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (numCuenta == null) {
			if (other.numCuenta != null)
				return false;
		} else if (!numCuenta.equals(other.numCuenta))
			return false;
		return true;
	}
	
	
	
	
	
	
}
