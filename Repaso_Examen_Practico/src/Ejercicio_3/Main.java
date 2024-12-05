package Ejercicio_3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cafeteria> cafeterias = new ArrayList<>();

        int continuar;
        do {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la cafetería:");
            String licenciaFiscal = JOptionPane.showInputDialog("Ingrese la licencia fiscal:");
            String domicilio = JOptionPane.showInputDialog("Ingrese el domicilio:");
            String fechaApertura = JOptionPane.showInputDialog("Ingrese la fecha de apertura (dd/mm/yyyy):");
            String horario = JOptionPane.showInputDialog("Ingrese el horario de atención:");

            Cafeteria cafeteria = new Cafeteria(nombre, licenciaFiscal, domicilio, fechaApertura, horario);

            int continuarTitulares;
            do {
                String nombreTitular = JOptionPane.showInputDialog("Ingrese el nombre del titular:");
                String cedulaTitular = JOptionPane.showInputDialog("Ingrese la cédula del titular:");
                String domicilioTitular = JOptionPane.showInputDialog("Ingrese el domicilio del titular:");
                String telefonoTitular = JOptionPane.showInputDialog("Ingrese el teléfono del titular:");
                cafeteria.agregarTitular(new Titular(nombreTitular, cedulaTitular, domicilioTitular, telefonoTitular));
                continuarTitulares = JOptionPane.showConfirmDialog(null, "¿Desea agregar otro titular?");
            } while (continuarTitulares == JOptionPane.YES_OPTION);

            int continuarEmpleados;
            do {
                int numeroEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de empleado:"));
                String nombreEmpleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
                String cedulaEmpleado = JOptionPane.showInputDialog("Ingrese la cédula del empleado:");
                String domicilioEmpleado = JOptionPane.showInputDialog("Ingrese el domicilio del empleado:");
                String funcion = JOptionPane.showInputDialog("Ingrese la función del empleado:");
                cafeteria.agregarEmpleado(new Empleado(numeroEmpleado, nombreEmpleado, cedulaEmpleado, domicilioEmpleado, funcion));
                continuarEmpleados = JOptionPane.showConfirmDialog(null, "¿Desea agregar otro empleado?");
            } while (continuarEmpleados == JOptionPane.YES_OPTION);

            cafeterias.add(cafeteria);
            continuar = JOptionPane.showConfirmDialog(null, "¿Desea agregar otra cafetería?");
        } while (continuar == JOptionPane.YES_OPTION);

        for (Cafeteria cafeteria : cafeterias) {
            cafeteria.mostrarDatosCafeteria();
        }
    }
}
