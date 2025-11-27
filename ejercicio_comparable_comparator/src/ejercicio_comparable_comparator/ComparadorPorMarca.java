package ejercicio_comparable_comparator;

import java.util.Comparator;

public class ComparadorPorMarca implements Comparator<Vehiculo>{

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		// TODO Auto-generated method stub
		return o1.marca.compareTo(o2.marca); //Siempre con los Strings
	}
		//El string tiene el método compareTo por defecto
		//Para el resto se usa compare
	
}
