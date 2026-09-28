package Ejercicio7_restaurantePedidos;

public class Mozo {
    private String nombre;

    public Mozo(String nombre) {
        this.nombre = nombre;
    }

    public void enviarPedidoACocina(Pedido pedido, Cocina cocina) {
        if (pedido.getPlatos().isEmpty()) {
            System.out.println(nombre + ": el pedido de la mesa " + pedido.getNumeroMesa() + " está vacío, no se envía.");
            return;
        }
        System.out.println(nombre + " envía a cocina el pedido de la mesa " + pedido.getNumeroMesa()
                + " (total $" + pedido.calcularTotal() + ").");
        cocina.recibirComanda(pedido);
    }
}
