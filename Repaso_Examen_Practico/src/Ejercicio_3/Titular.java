package Ejercicio_3;

import javax.swing.*;

public class Titular extends Persona {
    private String telefono;

    public Titular(String nombre, String cedula, String domicilio, String telefono) {
        super(nombre, cedula, domicilio);
        this.telefono = telefono;
    }

    public void mostrarDatosTitular() {
        JOptionPane.showMessageDialog(null,
                "Titular:\nNombre: " + nombre + "\nCédula: " + cedula +
                        "\nDomicilio: " + domicilio + "\nTeléfono: " + telefono);
    }
}
