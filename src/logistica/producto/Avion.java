package logistica.producto;

// CONCRETE PRODUCT
public class Avion implements Transporte {

    @Override
    public String getNombre() {
        return "Avión";
    }

    @Override
    public int getCapacidadMaxKg() {
        return 100000;
    }

    @Override
    public void entregar(String origen, String destino, int pesoKg) {
        System.out.println("   Avión lleva " + pesoKg + " kg de " + origen + " a " + destino + " por aire.");
    }
}
