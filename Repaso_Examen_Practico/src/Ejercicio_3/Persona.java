package Ejercicio_3;

import javax.swing.*;

public class Persona {
    protected String nombre;
    protected String cedula;
    protected String domicilio;

    public Persona(String nombre, String cedula, String domicilio) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.domicilio = domicilio;
    }

    public void mostrarDatosPersona() {
        JOptionPane.showMessageDialog(null,
                "Nombre: " + nombre + "\nCédula: " + cedula + "\nDomicilio: " + domicilio);
    }
}
