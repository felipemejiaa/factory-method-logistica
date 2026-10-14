package logistica.producto;

// CONCRETE PRODUCT
public class Camion implements Transporte {

    @Override
    public String getNombre() {
        return "Camión";
    }

    @Override
    public int getCapacidadMaxKg() {
        return 30000;
    }

    @Override
    public void entregar(String origen, String destino, int pesoKg) {
        System.out.println("   Camión lleva " + pesoKg + " kg de " + origen + " a " + destino + " por carretera.");
    }
}
