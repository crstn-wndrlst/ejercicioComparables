package ejercicio_comparable_comparator;

class Vehiculo implements Comparable<Vehiculo> {
    String marca;
    String modelo;
    int anio;
    double precio;

    Vehiculo(String marca, String modelo, int anio, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }
   
    @Override
    public String toString() {
        return marca + " " + modelo + " | Año: " + anio + " | " + precio + " €";
    }

    public String getMarca() { 
    	return marca; }
    
    public int getAnio() { 
    	return anio; }

	@Override
	public int compareTo(Vehiculo o) {
		// TODO Auto-generated method stub
		return Double.compare(this.precio, o.precio);
		//return Double.compare(o.precio, this.precio) -- chequear (ascendiente - el de arriba -, descendiente?)
	}
	
	/*public int compareTo(Vehiculo o) {
		return this.marca.compareTo(o.marca);
	}*/
	
	//Primero implementas comparable
	//Le metes el compareTo
	//Ojo, implements comparable -> es en la propia clase (orden natural: de menos más)
	//El comparator va en una interfaz
	//Comparable precio vs comparator precio (Ojo, mirar bien las diferencias)
}
