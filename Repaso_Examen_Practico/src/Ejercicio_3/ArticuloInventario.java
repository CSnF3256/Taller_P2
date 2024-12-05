package Ejercicio_3;

import javax.swing.*;

class ArticuloInventario {
    private String codigo;
    private String nombre;
    private int cantidad;
    private double precioCoste;

    public ArticuloInventario(String codigo, String nombre, int cantidad, double precioCoste) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioCoste = precioCoste;
    }

    public void mostrarDatosArticulo() {
        JOptionPane.showMessageDialog(null,
                "Artículo de Inventario:\nCódigo: " + codigo + "\nNombre: " + nombre +
                        "\nCantidad: " + cantidad + "\nPrecio de Coste: $" + precioCoste);
    }
}
