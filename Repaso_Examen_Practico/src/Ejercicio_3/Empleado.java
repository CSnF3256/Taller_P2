package Ejercicio_3;

import javax.swing.*;

public class Empleado extends Persona {
    private int numeroEmpleado;
    private String funcion;

    public Empleado(int numeroEmpleado, String nombre, String cedula, String domicilio, String funcion) {
        super(nombre, cedula, domicilio);
        this.numeroEmpleado = numeroEmpleado;
        this.funcion = funcion;
    }

    public void mostrarDatosEmpleado() {
        JOptionPane.showMessageDialog(null,
                "Empleado:\nNúmero de Empleado: " + numeroEmpleado + "\nNombre: " + nombre +
                        "\nCédula: " + cedula + "\nDomicilio: " + domicilio + "\nFunción: " + funcion);
    }
}
