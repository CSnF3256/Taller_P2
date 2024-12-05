package Ejercicio_1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CentroDeportivo {
    private List<Socio> socios;
    private List<Reservas> reservas;

    public CentroDeportivo() {
        socios = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public static void main(String[] args) {
        CentroDeportivo centro = new CentroDeportivo();
        centro.menuPrincipal();
    }

    public void menuPrincipal() {
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Centro Deportivo\n\nSeleccione una opción:\n" +
                            "1. Registrar Socio\n" +
                            "2. Hacer una Reserva\n" +
                            "3. Mostrar Reservas\n" +
                            "4. Mostrar Socios\n" +
                            "5. Salir"));

            switch (opcion) {
                case 1 -> registrarSocio();
                case 2 -> hacerReserva();
                case 3 -> mostrarReservas();
                case 4 -> mostrarSocios();
                case 5 -> JOptionPane.showMessageDialog(null, "Saliendo de la aplicación...");
                default -> JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 5);
    }

    private void registrarSocio() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del socio:");
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del socio:");
        String direccion = JOptionPane.showInputDialog("Ingrese la dirección del socio:");
        String provincia = JOptionPane.showInputDialog("Ingrese la provincia del socio:");
        String ciudad = JOptionPane.showInputDialog("Ingrese la ciudad del socio:");
        String telefono = JOptionPane.showInputDialog("Ingrese el teléfono del socio:");
        int cuota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cuota del socio:"));

        Socio socio = new Socio(nombre, cedula, direccion, provincia, ciudad, telefono, cuota);
        socios.add(socio);

        JOptionPane.showMessageDialog(null, "Socio registrado exitosamente.");
    }

    private void hacerReserva() {
        if (socios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay socios registrados.");
            return;
        }

        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del socio:");
        Socio socio = buscarSocio(cedula);

        if (socio == null) {
            JOptionPane.showMessageDialog(null, "Socio no encontrado.");
            return;
        }

        String fecha = JOptionPane.showInputDialog("Ingrese la fecha de la reserva (dd/mm/yyyy):");
        String horaInicio = JOptionPane.showInputDialog("Ingrese la hora de inicio (hh:mm):");
        String horaFin = JOptionPane.showInputDialog("Ingrese la hora de fin (hh:mm):");

        String instalacion = JOptionPane.showInputDialog("Ingrese la instalación a reservar:\n1. Piscina\n2. Frontones\n3. Tenis\n4. Gimnasio");

        Reservas reserva = new Reservas(fecha, horaInicio, horaFin, socio, instalacion);
        reservas.add(reserva);

        String alquilarArticulos = JOptionPane.showInputDialog("¿Desea alquilar artículos? (S/N):");
        if (alquilarArticulos.equalsIgnoreCase("S")) {
            reserva.alquilarArticulos();
        }

        JOptionPane.showMessageDialog(null, "Reserva realizada exitosamente.");
    }

    private Socio buscarSocio(String cedula) {
        for (Socio s : socios) {
            if (s.getCedula().equals(cedula)) {
                return s;
            }
        }
        return null;
    }

    private void mostrarReservas() {
        if (reservas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay reservas registradas.");
            return;
        }

        StringBuilder info = new StringBuilder("Reservas Registradas:\n\n");
        for (Reservas r : reservas) {
            info.append(r.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, info.toString());
    }

    private void mostrarSocios() {
        if (socios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay socios registrados.");
            return;
        }

        StringBuilder info = new StringBuilder("Socios Registrados:\n\n");
        for (Socio s : socios) {
            info.append(s.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, info.toString());
    }
}

