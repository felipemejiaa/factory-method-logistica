package logistica.creador;

import logistica.producto.Transporte;

// CREATOR: declara el factory method y tiene la lógica de negocio
public abstract class Logistica {

    // FACTORY METHOD: cada subclase decide qué transporte crear
    protected abstract Transporte crearTransporte();

    // LÓGICA DE NEGOCIO: no sabe qué transporte está usando
    public void planificarEntrega(String origen, String destino, int pesoKg) {
        Transporte transporte = crearTransporte();      // 1. pide el transporte

        if (pesoKg > transporte.getCapacidadMaxKg()) {   // 2. valida el peso
            throw new IllegalArgumentException("El " + transporte.getNombre()
                    + " solo soporta " + transporte.getCapacidadMaxKg() + " kg.");
        }

        transporte.entregar(origen, destino, pesoKg);    // 3. hace la entrega
    }
}
