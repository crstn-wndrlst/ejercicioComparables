package ejercicio_comparable_comparator;

import java.util.Comparator;

public class ComparadorPorAnio implements Comparator<Vehiculo>{

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.anio, o2.anio); //usas el compare y no el o1.anio.compareTo
	}

}
