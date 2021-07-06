package c180colecciones;
import java.util.*;
//clase 185
//listas ordenadas: en el mismo orden en que fueron agregados los elementos

public class PruebaLinkedList {

	public static void main(String[] args) {
		
		
		//construir la LinkedList y agregar elementos
		LinkedList<String> personas= new LinkedList<String>();
		
		personas.add("pepe");
		personas.add("maria");
		personas.add("jose");
		personas.add("ana");
		
		//tamaño
		System.out.println(personas.size());
		
		
		
		//agregar un elemento en una posicion concreta
		ListIterator<String> it= personas.listIterator();
		
		//me dezplazo una posicion adelante
		it.next();
		
		//agrego alli un elemento, estaria en la segunda posicion
		it.add("pablo");
		
		
		//contenido
		for (String persona : personas) {
			
			System.out.println(persona);
			
		}
		
		
		

	}

}
