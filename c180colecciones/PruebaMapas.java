package c180colecciones;
import java.util.*;

public class PruebaMapas {

	public static void main(String[] args) {

//clave string, valor empleado
		
		HashMap<String, Empleado> personal= new HashMap<String, Empleado>();
		
		//las claves no se pueden repetir
		personal.put("145", new Empleado("benito"));
		personal.put("146", new Empleado("ana"));
		personal.put("147", new Empleado("juan"));
		personal.put("148", new Empleado("pedro"));
		
		
		System.out.println(personal);

		//eliminar un objeto
		personal.remove("147");
		
		System.out.println("***********************************************************************");
		System.out.println(personal);
		
		
		//sustituir un elemento: introducir un elemento con la misma clave
		personal.replace("148", new Empleado("sustitucion"));
		
		System.out.println("***********************************************************************");
		System.out.println(personal);
		
		//metodo de la interface Map entrySet() devuelve una vista de lo que hay dentro del mapa
		//recibe una interface interna map.Entry<clave, valor>
		//getkey() getValue()
		
		//devuelva una coleccion de tipo set y la imprima
		
		System.out.println("***********************************************************************");
		System.out.println(personal.entrySet());
		
		//for each
		//personal.entrySet devuelve lo que hay en la coleccion personal en forma de set
		//almaceno la pareja de valores entrada
		//puedo separar clave de valor 
		
		System.out.println("***********************************************************************");
		for (Map.Entry<String, Empleado> entrada: personal.entrySet()) {
			
			String clave= entrada.getKey();
			
			Empleado valor= entrada.getValue();
			
			System.out.println("clave: "+clave+ " valor: "+valor);
			
		}
		
		
	}

}


class Empleado{
	private String nom;
	private double sue;
	
	public Empleado(String n) {
		nom= n;
		sue=2000;
		
		
	}
	
	
	public String toString() {
		
		return "[nombre= "+nom+ ", sueldo= "+sue+" ]";
	}
	
	
}