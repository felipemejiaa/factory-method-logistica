package logistica.producto;

// PRODUCT: lo que todos los transportes deben saber hacer
public interface Transporte {
    String getNombre();
    int getCapacidadMaxKg();
    void entregar(String origen, String destino, int pesoKg);
}
