package c180colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//clase 181: HashSet no permite duplicados, como hacer saber a mi programa que son el mismo objeto
//metodos hasCode() y equals()
public class CuentasUsuarios {

	public static void main(String[] args) {
		// instancias del tipo cliente
		
		Cliente c1= new Cliente("antonio","00001",200000);
		Cliente c2= new Cliente("maria","00002",250000);
		Cliente c3= new Cliente("pablo","00003",500000);
		Cliente c4= new Cliente("ariel","00004",20500);
		//no lo agrega porque detecta que son el mismo objeto por el mismo numero de cuenta
		Cliente c5= new Cliente("ariel","00004",20500);


		//crear la coleccion: elegir coleccion mas adecuada. tipo Set
		//se pueden repetir los elementos? no
		//agregar, borrar?
		//solo lectura?
		//tengo que elegir una clase que se adecue a mis necesidades que implemente la I Set 
		
		Set <Cliente> clientesBanco= new HashSet<Cliente>();
		
		//agregar clientes a la coleccion
		clientesBanco.add(c1);
		clientesBanco.add(c2);
		clientesBanco.add(c3);
		clientesBanco.add(c4);
		
		//recorro la coleccion
		//eclipse= fore + barra+ ctrl: bucle for each
		//eclipse= syso + barra + ctrl: System.out.print
		
		for (Cliente c : clientesBanco) {
			
			System.out.println(c.getNombre()+" "+c.getNumCuenta()+" "+c.getSaldo());
			
			
		} 
		
		
		//recorrer la coleccion con un iterador: metodo iterator()
		Iterator<Cliente> it= clientesBanco.iterator() ;
		
		//analiza si hay siguiente elemento o no
		while(it.hasNext()) {
			
			//salta una posicion y getNombre de la posicion pasada
			String nombreCliente= it.next().getNombre();
			
			System.out.println(nombreCliente);
			
		}
		
		//si quiero borrar un elemento, no se puede eliminar un objeto con el bucle for each, lanza una exception 
		/*for (Cliente c : clientesBanco) {
			
			if(c.getNombre().equals("antonio")) {
				
				clientesBanco.remove(c);
				
			}
			
		}*/
		
		//si queiro eliminar un objeto de una coleccion lo hago con un iterador
		Iterator<Cliente> it2= clientesBanco.iterator();
		
		while(it2.hasNext()) {
			
			String nombreCliente=it2.next().getNombre();
			
			if(nombreCliente.equals("antonio")) {
				
				it2.remove();
				
			}
		}
		
		

		for (Cliente c : clientesBanco) {
			
			System.out.println(c.getNombre()+" "+c.getNumCuenta()+" "+c.getSaldo());
			
			
		} 
		
		
		
		
	}

}
