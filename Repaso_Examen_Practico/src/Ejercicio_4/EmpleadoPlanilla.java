package Ejercicio_4;

import java.time.LocalDate;
import java.util.Comparator;
class EmpleadoPlanilla extends Empleado {
    private double salarioMensual;
    private double porcentajeHoraExtra;

    public EmpleadoPlanilla(String cedula, String nombre, String apellido, LocalDate fechaNacimiento,
                            String direccion, String ciudadProcedencia, String codigoEmpleado,
                            int horasExtras, LocalDate fechaIngreso, String area, String cargo,
                            double salarioMensual, double porcentajeHoraExtra) {
        super(cedula, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia,
                codigoEmpleado, horasExtras, fechaIngreso, area, cargo);
        this.salarioMensual = salarioMensual;
        this.porcentajeHoraExtra = porcentajeHoraExtra;
    }

    @Override
    public double calcularSalario() {
        double valorHoraExtra = salarioMensual * porcentajeHoraExtra / 100.0;
        return salarioMensual + (getHorasExtras() * valorHoraExtra);
    }

    // Getters y setters
    public double getSalarioMensual() { return salarioMensual; }
    public void setSalarioMensual(double salarioMensual) { this.salarioMensual = salarioMensual; }
    public double getPorcentajeHoraExtra() { return porcentajeHoraExtra; }
    public void setPorcentajeHoraExtra(double porcentajeHoraExtra) { this.porcentajeHoraExtra = porcentajeHoraExtra; }
}
