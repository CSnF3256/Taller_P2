package Ejercicio_4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Scanner;

class SistemaHospital {
    private List<Paciente> pacientes = new ArrayList<>();
    private List<Medico> medicos = new ArrayList<>();
    private List<Cita> citas = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void registrarPaciente() {
        System.out.println("Registro de Paciente:");
        System.out.print("Cedula: ");
        String cedula = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Fecha de nacimiento (YYYY-MM-DD): ");
        LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
        System.out.print("Direccion: ");
        String direccion = scanner.nextLine();
        System.out.print("Ciudad de procedencia: ");
        String ciudadProcedencia = scanner.nextLine();
        System.out.print("Historia Clinica: ");
        String historiaClinica = scanner.nextLine();
        System.out.print("Sexo (M/F): ");
        String sexo = scanner.nextLine();
        System.out.print("Grupo Sanguineo: ");
        String grupoSanguineo = scanner.nextLine();
        System.out.print("Alergias a medicamentos (separadas por coma): ");
        String alergiasInput = scanner.nextLine();
        List<String> alergiasMedicamentos = new ArrayList<>();
        if (!alergiasInput.isEmpty()) {
            String[] alergias = alergiasInput.split(",");
            for (String alergia : alergias) {
                alergiasMedicamentos.add(alergia.trim());
            }
        }
        Paciente paciente = new Paciente(cedula, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia,
                historiaClinica, sexo, grupoSanguineo, alergiasMedicamentos);
        pacientes.add(paciente);
        System.out.println("Paciente registrado exitosamente.");
    }

    public void registrarMedico() {
        System.out.println("Registro de Medico:");
        System.out.print("Cedula: ");
        String cedula = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Fecha de nacimiento (YYYY-MM-DD): ");
        LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
        System.out.print("Direccion: ");
        String direccion = scanner.nextLine();
        System.out.print("Ciudad de procedencia: ");
        String ciudadProcedencia = scanner.nextLine();
        System.out.print("Especialidad: ");
        String especialidad = scanner.nextLine();
        System.out.print("Salario mensual: ");
        double salarioMensual = Double.parseDouble(scanner.nextLine());
        Medico medico = new Medico(cedula, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia, especialidad, salarioMensual);
        medicos.add(medico);
        System.out.println("Medico registrado exitosamente.");
    }

    public void registrarCita() {
        System.out.println("Registro de Cita:");
        System.out.print("Ingrese cedula del paciente: ");
        String cedulaPaciente = scanner.nextLine();
        Paciente paciente = null;
        for (Paciente p : pacientes) {
            if (p.getCedula().equals(cedulaPaciente)) {
                paciente = p;
                break;
            }
        }
        if (paciente == null) {
            System.out.println("Paciente no encontrado.");
            return;
        }
        System.out.print("Ingrese cedula del medico: ");
        String cedulaMedico = scanner.nextLine();
        Medico medico = null;
        for (Medico m : medicos) {
            if (m.getCedula().equals(cedulaMedico)) {
                medico = m;
                break;
            }
        }
        if (medico == null) {
            System.out.println("Medico no encontrado.");
            return;
        }
        System.out.print("Fecha de la cita (YYYY-MM-DD): ");
        LocalDate fecha = LocalDate.parse(scanner.nextLine());
        System.out.print("Hora de la cita: ");
        String hora = scanner.nextLine();
        Cita cita = new Cita(paciente, medico, fecha, hora);
        citas.add(cita);
        System.out.println("Cita registrada exitosamente.");
    }

    public void mostrarDatos() {
        System.out.println("----- Pacientes -----");
        for (Paciente p : pacientes) {
            System.out.println(p);
        }

        System.out.println("----- Medicos -----");
        for (Medico m : medicos) {
            System.out.println(m);
        }

        System.out.println("----- Citas -----");
        for (Cita c : citas) {
            System.out.println(c);
        }
    }

    public void menu() {
        while (true) {
            System.out.println("\nSistema Hospital:");
            System.out.println("1. Registrar Paciente");
            System.out.println("2. Registrar Medico");
            System.out.println("3. Registrar Cita");
            System.out.println("4. Mostrar Datos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    registrarPaciente();
                    break;
                case 2:
                    registrarMedico();
                    break;
                case 3:
                    registrarCita();
                    break;
                case 4:
                    mostrarDatos();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        SistemaHospital sistema = new SistemaHospital();
        sistema.menu();
    }
}