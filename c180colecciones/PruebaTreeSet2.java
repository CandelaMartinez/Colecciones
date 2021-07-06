package c180colecciones;
import java.util.*;


//clase 188: si quiero almacenar objetos que no cree yo que no implemeta la iterface comparator
public class PruebaTreeSet2 {

	public static void main(String[] args) {
		
		//objeto que implementa la interface comparator
	//ComparadorArticulos comparaAr= new ComparadorArticulos();
		
	//Treset, contructor que recibe por parametro un objeto de la interface comparator
	//TreeSet <Articulo2> ordenaArticulos2= new TreeSet<>(comparaAr);
		
		//o puedo hacerlo con una clase interna anonima, y no necesito crear la clase ComparadorArticulos
		TreeSet <Articulo2> ordenaArticulos2= new TreeSet<Articulo2>(
				
				new Comparator<Articulo2>() {
				
				@Override
				public int compare(Articulo2 o1, Articulo2 o2) {
					
					String desc1=o1.getDes();
					String desc2=o2.getDes();
					
					return desc1.compareTo(desc2);}
				
				});
		
		
		
		
		Articulo2 primero= new Articulo2(1, "primer articulo");
		Articulo2 seg= new Articulo2(2, "seg articulo");
		Articulo2 ter= new Articulo2(3, "ter articulo");
		Articulo2 cua= new Articulo2(4, "cuar articulo");
		
		TreeSet<Articulo2> ordenaArticulos= new TreeSet<Articulo2>();
		ordenaArticulos.add(primero);
		ordenaArticulos.add(cua);
		ordenaArticulos.add(seg);
		ordenaArticulos.add(ter);
		
		for (Articulo2 a : ordenaArticulos) {
			
			System.out.println(a.getDes());
			
		}
		
		
		ordenaArticulos2.add(primero);
		ordenaArticulos2.add(cua);
		ordenaArticulos2.add(seg);
		ordenaArticulos2.add(ter);
		
	System.out.println("*****************************************************************");	
for (Articulo2 a : ordenaArticulos2) {
			
			System.out.println(a.getDes());
			
		}
		
		
	}

}

//voy a querer guardar en un treeSet los objeto articulo asi que tengo que implementar la interface comparable
class Articulo2 implements Comparable<Articulo2>{
	//campos de clase
	private int articulo;
	private String descripcion;
	
	
	
	
	//constructor
	 public Articulo2(int num, String des) {
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
	public int compareTo(Articulo2 o) {
		
		return articulo- o.articulo ;
		
		
		
	}

}

//creo una clase para no obligar a la clase que construye los objetos a implementar ninguna interface
//si la clase Articulo2 no la creamos no hay problema
class ComparadorArticulos implements Comparator<Articulo2>{

	@Override
	public int compare(Articulo2 o1, Articulo2 o2) {
		
		String desc1=o1.getDes();
		String desc2=o2.getDes();
		
		return desc1.compareTo(desc2);
	}
	
	
	
	
}
