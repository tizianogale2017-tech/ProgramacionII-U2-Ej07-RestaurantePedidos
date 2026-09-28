package Ejercicio7_restaurantePedidos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroMesa;
    private List<Plato> platos = new ArrayList<>();

    public Pedido(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public void agregarPlato(Plato plato) {
        platos.add(plato);
    }

    public double calcularTotal() {
        double total = 0;
        for (Plato p : platos) {
            total += p.getPrecio();
        }
        return total;
    }

    public int calcularTiempoEstimado() {
        int mayor = 0;
        for (Plato p : platos) {
            mayor = Math.max(mayor, p.getTiempoPreparacionMinutos());
        }
        return mayor;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public List<Plato> getPlatos() {
        return platos;
    }
}
