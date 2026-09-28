package Ejercicio7_restaurantePedidos;

public class Main {
    public static void main(String[] args) {
        Cocina cocina = new Cocina();
        Mozo mozo = new Mozo("Ricardo");

        Pedido pedido = new Pedido(5);
        pedido.agregarPlato(new Plato("Milanesa con papas", 8500.0, 20));
        pedido.agregarPlato(new Plato("Ensalada mixta", 4200.0, 8));
        pedido.agregarPlato(new Plato("Flan con dulce de leche", 3500.0, 5));

        mozo.enviarPedidoACocina(pedido, cocina);
        cocina.mostrarEstado();
    }
}
