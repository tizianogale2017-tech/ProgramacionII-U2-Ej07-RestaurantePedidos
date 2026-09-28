package Ejercicio7_restaurantePedidos;

public class Plato {
    private String nombre;
    private double precio;
    private int tiempoPreparacionMinutos;

    public Plato(String nombre, double precio, int tiempoPreparacionMinutos) {
        this.nombre = nombre;
        this.precio = precio;
        this.tiempoPreparacionMinutos = tiempoPreparacionMinutos;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getTiempoPreparacionMinutos() {
        return tiempoPreparacionMinutos;
    }
}
