package ejercicio_comparable_comparator;

import java.util.Comparator;

public class ComparadorPorPrecioDesc implements Comparator<Vehiculo> {
	
		@Override
		public int compare(Vehiculo o1, Vehiculo o2) {
			// TODO Auto-generated method stub
			return Double.compare(o2.precio, o1.precio); 
		}

}

