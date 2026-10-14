package logistica.creador;

import logistica.producto.Avion;
import logistica.producto.Transporte;

// CONCRETE CREATOR
public class LogisticaAerea extends Logistica {

    @Override
    protected Transporte crearTransporte() {
        return new Avion();
    }
}
