package logistica;

import logistica.creador.Logistica;
import logistica.creador.LogisticaAerea;
import logistica.creador.LogisticaMaritima;
import logistica.creador.LogisticaTerrestre;

// CLIENTE: solo escoge la logística y llama a planificarEntrega()
public class Main {

    public static void main(String[] args) {
        Logistica logistica;

        System.out.println("1) Logística terrestre, 20.000 kg:");
        logistica = new LogisticaTerrestre();
        logistica.planificarEntrega("Bogotá", "Medellín", 20000);

        System.out.println("2) Logística marítima, 500.000 kg:");
        logistica = new LogisticaMaritima();
        logistica.planificarEntrega("Cartagena", "Miami", 500000);

        System.out.println("3) Logística aérea, 5.000 kg:");
        logistica = new LogisticaAerea();
        logistica.planificarEntrega("Bogotá", "Madrid", 5000);

        System.out.println("4) Logística terrestre, 50.000 kg:");
        try {
            logistica = new LogisticaTerrestre();
            logistica.planificarEntrega("Bogotá", "Cali", 50000);
        } catch (IllegalArgumentException e) {
            System.out.println("   Error: " + e.getMessage());
        }
    }
}
