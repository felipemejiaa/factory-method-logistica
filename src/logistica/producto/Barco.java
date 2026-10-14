package logistica.producto;

// CONCRETE PRODUCT
public class Barco implements Transporte {

    @Override
    public String getNombre() {
        return "Barco";
    }

    @Override
    public int getCapacidadMaxKg() {
        return 2000000;
    }

    @Override
    public void entregar(String origen, String destino, int pesoKg) {
        System.out.println("   Barco lleva " + pesoKg + " kg de " + origen + " a " + destino + " por mar.");
    }
}
