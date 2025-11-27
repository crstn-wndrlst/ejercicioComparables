package ejercicio_comparable_comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AppVehiculos {
	public static void main(String[] args) {
		List<Vehiculo> lista = new ArrayList<>(Arrays.asList(
				new Vehiculo("Toyota", "Corolla", 2020, 18000),
				new Vehiculo("Ford", "Focus", 2018, 15000), 
				new Vehiculo("BMW", "X3", 2022, 45000),
				new Vehiculo("Audi", "A3", 2021, 35000), 
				new Vehiculo("Honda", "Civic", 2019, 20000)));


		//System.out.println("=== LISTA ORIGINAL ===");
        System.out.println(lista);

        // 1- Orden natural por precio (Comparable)
        System.out.println("\nLista ordenada por comparable");
        Collections.sort(lista);
        System.out.println(lista);
        
        // 2- Orden por marca (Comparator externo)
        Collections.sort(lista, new ComparadorPorMarca());
        System.out.println("\nLista ordenada por comparator Marca");
        System.out.println(lista);
        
        // 3- Orden por año (Comparator externo) Si quiere uno descendente me creo otra clase.
        Collections.sort(lista, new ComparadorPorAnio());
        System.out.println("\nLista ordenada por comparator Anio");
        System.out.println(lista);

        // 4- Orden por precio descendente
		Collections.sort(lista, new ComparadorPorPrecioDesc());
		System.out.println("\nLista ordenada por comparator PrecioDesc");
        System.out.println(lista);
        
        // 5- Clase anónima para ordenar por año descendente
        ComparadorPorAnio miComparador = new ComparadorPorAnio() {	
        }; //Ahí va la clase anónima
        
        //Un comentario nuevo	
        
    }
}

	
