package logistica.creador;

import logistica.producto.Barco;
import logistica.producto.Transporte;

// CONCRETE CREATOR
public class LogisticaMaritima extends Logistica {

    @Override
    protected Transporte crearTransporte() {
        return new Barco();
    }
}
