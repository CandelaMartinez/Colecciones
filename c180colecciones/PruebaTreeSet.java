package c180colecciones;
import java.util.*;

//clase 186
//treeset ordena alfabeticamente si es String. comparable interface. compareTo()
//clase 187
//constructor TreeSet que admite comparator objetos como parametro asi que puedo comparar con otro tipo de campo
//clase 188: si quiero almacenar objetos que no cree yo que no implemeta la iterface comparator
public class PruebaTreeSet {

	public static void main(String[] args) {
		
		//TreeSet<String> ordenaPer= new TreeSet<String>();
		
		//ordenaPer.add("sandra");
		//ordenaPer.add("juan");
		//ordenaPer.add("ana");
		
		//System.out.println(ordenaPer);

		
		//lo imprime ordenado alfabeticamente
		//for (String s : ordenaPer) {
			
		//	System.out.println(s);
		//}
		
		
		Articulo primero= new Articulo(1, "primer articulo");
		Articulo seg= new Articulo(2, "seg articulo");
		Articulo ter= new Articulo(3, "ter articulo");
		Articulo cua= new Articulo(4, "cuar articulo");
		
		TreeSet<Articulo> ordenaArticulos= new TreeSet<Articulo>();
		ordenaArticulos.add(primero);
		ordenaArticulos.add(cua);
		ordenaArticulos.add(seg);
		ordenaArticulos.add(ter);
		
		for (Articulo a : ordenaArticulos) {
			
			System.out.println(a.getDes());
			
		}
		
		
		//creo un objeto de tipo comparador
		Articulo comparadorArti= new Articulo();
		
		//en este treeset los objetos se van a ordenar segun lo que marque elcomparador.
		TreeSet<Articulo> ordenaAlfa= new TreeSet<Articulo>(comparadorArti);
		
		ordenaAlfa.add(primero);
		ordenaAlfa.add(seg);
		ordenaAlfa.add(ter);
		ordenaAlfa.add(cua);
		
	System.out.println("*************************************************************************************");	
	for (Articulo a : ordenaAlfa) {
			
			System.out.println(a.getDes());
			
		}
	}

}

//voy a querer guardar en un treeSet los objeto articulo asi que tengo que implementar la interface comparable
class Articulo implements Comparable<Articulo>, Comparator<Articulo>{
	//campos de clase
	private int articulo;
	private String descripcion;
	
	public Articulo() {
		
	}
	
	
	//constructor
	 public Articulo(int num, String des) {
		articulo= num;
		descripcion=des;
	}
	
	 //getter
	public String getDes() {
		
		return descripcion;
	}
	 
	 //de comparable
	 //metodo compareto de la interface comparable
	//devuelve 0 1 o -1
	@Override
	public int compareTo(Articulo o) {
		
		return articulo- o.articulo ;
		
		
		
	}

	//de comparator
	//ordenar alfabeticamente
	@Override
	public int compare(Articulo o1, Articulo o2) {
		
		String descripcionA= o1.getDes();
		String descripcionB=o2.getDes();
		
		
		return descripcionA.compareTo(descripcionB);
		
	}
	
	
	
	
	
}