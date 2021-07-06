package c180colecciones;
//clase 186

import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaListaEnlazada {

	public static void main(String[] args) {
	
		
		//linkedlist que almacena los paises
		LinkedList<String> paises= new LinkedList<String>();
		
		paises.add("españa");
		paises.add("argentina");
		paises.add("mexico");
		paises.add("uk");
		
		//linkedlist que almacena los capitales
		LinkedList<String> capitales= new LinkedList<String>();
		
		capitales.add("madrid");
		capitales.add("bsas");
		capitales.add("df");
		capitales.add("londres");
		
		//System.out.println(paises);
		//System.out.println(capitales);
		
		
		//agrego intercaladas la lista de capitales en la de paises con ListIterator
		ListIterator<String> itPais= paises.listIterator();
		
		ListIterator<String> itCap= capitales.listIterator();
		
		//mientras haya prox elemento en capitales y si hay prox elemento en paises
		while(itCap.hasNext()) {
			
			if(itPais.hasNext()) {
				
				//pasa una posicion en pais, agrega en pais la siguiente posicion de capitales
				itPais.next();
				itPais.add(itCap.next());
				
			}
		}

		
		//System.out.println(paises);
		
		//System.out.println(capitales);
		
		//eliminar las posiciones pares
		//el iterador se encuentra en la ultima posicion ahora, tengo que subirlo al principio
		//reiniciar el iterador
		itCap=capitales.listIterator();
		
		//mientras capitales tenga proximo elemento
		//salta un elemento a la posicion 2
		//hay otra posicion? salta a la posicion 3
		//borra la posicion que deje atras, la 2
		while(itCap.hasNext()) {
			
			itCap.next();
			
			if(itCap.hasNext()) {
				
				itCap.next();
				itCap.remove();
			}
		}
		
		
		System.out.println(capitales);
		
		System.out.println(paises);
		
		
		//borro de paises las capitales que quedaban en la lista de capitales, las que no borre cuando borre las posiciones pares
		paises.removeAll(capitales);
		
		System.out.println(paises);
		System.out.println(capitales);
		
		
		
	}

}
