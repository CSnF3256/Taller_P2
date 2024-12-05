package Ejercicio_4;

import java.time.LocalDate;

abstract class Empleado extends Persona {
    private String codigoEmpleado;
    private int horasExtras;
    private LocalDate fechaIngreso;
    private String area;
    private String cargo;

    public Empleado(String cedula, String nombre, String apellido, LocalDate fechaNacimiento,
                    String direccion, String ciudadProcedencia, String codigoEmpleado,
                    int horasExtras, LocalDate fechaIngreso, String area, String cargo) {
        super(cedula, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia);
        this.codigoEmpleado = codigoEmpleado;
        this.horasExtras = horasExtras;
        this.fechaIngreso = fechaIngreso;
        this.area = area;
        this.cargo = cargo;
    }

    // Método abstracto para calcular salario
    public abstract double calcularSalario();

    // Getters y setters
    public String getCodigoEmpleado() { return codigoEmpleado; }
    public void setCodigoEmpleado(String codigoEmpleado) { this.codigoEmpleado = codigoEmpleado; }
    public int getHorasExtras() { return horasExtras; }
    public void setHorasExtras(int horasExtras) { this.horasExtras = horasExtras; }
    public LocalDate getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(LocalDate fechaIngreso) { this.fechaIngreso = fechaIngreso; }
    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
}
