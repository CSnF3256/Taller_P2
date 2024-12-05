package Ejercicio_3;

import javax.swing.*;

class Pedido {
    private int numeroPedido;
    private String fecha;
    private String proveedor;
    private String codigoArticulo;
    private String nombreArticulo;
    private int cantidad;

    public Pedido(int numeroPedido, String fecha, String proveedor, String codigoArticulo, String nombreArticulo, int cantidad) {
        this.numeroPedido = numeroPedido;
        this.fecha = fecha;
        this.proveedor = proveedor;
        this.codigoArticulo = codigoArticulo;
        this.nombreArticulo = nombreArticulo;
        this.cantidad = cantidad;
    }

    public void mostrarDatosPedido() {
        JOptionPane.showMessageDialog(null,
                "Pedido:\nNúmero de Pedido: " + numeroPedido + "\nFecha: " + fecha +
                        "\nProveedor: " + proveedor + "\nCódigo de Artículo: " + codigoArticulo +
                        "\nNombre de Artículo: " + nombreArticulo + "\nCantidad: " + cantidad);
    }
}