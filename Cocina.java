package Ejercicio7_restaurantePedidos;

import java.util.LinkedList;
import java.util.Queue;

public class Cocina {
    private Queue<Pedido> pendientes = new LinkedList<>();

    public void recibirComanda(Pedido pedido) {
        pendientes.add(pedido);
        System.out.println("[Cocina] Comanda recibida de la mesa " + pedido.getNumeroMesa() + ".");
    }

    public void mostrarEstado() {
        System.out.println("[Cocina] Pedidos pendientes: " + pendientes.size());
        for (Pedido p : pendientes) {
            System.out.println("  Mesa " + p.getNumeroMesa() + " - " + p.getPlatos().size() + " platos - listo en aprox. "
                    + p.calcularTiempoEstimado() + " min");
        }
    }
}
