package Ejercicio_1;

import javax.swing.*;

public class Reservas extends ReservaBase {
    private String instalacion;

    public Reservas(String fecha, String horaInicio, String horaFin, Socio socio, String instalacion) {
        super(fecha, horaInicio, horaFin, socio);
        this.instalacion = instalacion;
    }

    public void alquilarArticulos() {
        String articulo = JOptionPane.showInputDialog("Ingrese el artículo a alquilar:\n1. Balones\n2. Redes\n3. Raquetas");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a alquilar:"));
        JOptionPane.showMessageDialog(null, "Artículo alquilado: " + articulo + ", Cantidad: " + cantidad);
    }


    public String toString() {
        return super.toString() + ", Instalación: " + instalacion;
    }
}

