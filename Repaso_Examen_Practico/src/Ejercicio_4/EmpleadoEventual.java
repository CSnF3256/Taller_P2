package Ejercicio_4;
import java.util.Comparator;
import java.time.LocalDate;

class EmpleadoEventual extends Empleado {
    private double honorariosPorHora;
    private int horasTotales;
    private LocalDate fechaTerminoContrato;

    public EmpleadoEventual(String cedula, String nombre, String apellido, LocalDate fechaNacimiento,
                            String direccion, String ciudadProcedencia, String codigoEmpleado,
                            int horasExtras, LocalDate fechaIngreso, String area, String cargo,
                            double honorariosPorHora, int horasTotales, LocalDate fechaTerminoContrato) {
        super(cedula, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia,
                codigoEmpleado, horasExtras, fechaIngreso, area, cargo);
        this.honorariosPorHora = honorariosPorHora;
        this.horasTotales = horasTotales;
        this.fechaTerminoContrato = fechaTerminoContrato;
    }

    @Override
    public double calcularSalario() {
        return honorariosPorHora * horasTotales;
    }

    // Getters y setters
    public double getHonorariosPorHora() { return honorariosPorHora; }
    public void setHonorariosPorHora(double honorariosPorHora) { this.honorariosPorHora = honorariosPorHora; }
    public int getHorasTotales() { return horasTotales; }
    public void setHorasTotales(int horasTotales) { this.horasTotales = horasTotales; }
    public LocalDate getFechaTerminoContrato() { return fechaTerminoContrato; }
    public void setFechaTerminoContrato(LocalDate fechaTerminoContrato) { this.fechaTerminoContrato = fechaTerminoContrato; }
}