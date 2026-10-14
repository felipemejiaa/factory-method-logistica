package logistica.creador;

import logistica.producto.Camion;
import logistica.producto.Transporte;

// CONCRETE CREATOR
public class LogisticaTerrestre extends Logistica {

    @Override
    protected Transporte crearTransporte() {
        return new Camion();
    }
}
