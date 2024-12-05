package Ejercicio_4;

import java.time.LocalDate;
import java.util.Comparator;
class Medico extends Persona {
    private String especialidad;
    private double salarioMensual;

    public Medico(String cedula, String nombre, String apellido, LocalDate fechaNacimiento,
                  String direccion, String ciudadProcedencia, String especialidad, double salarioMensual) {
        super(cedula, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia);
        this.especialidad = especialidad;
        this.salarioMensual = salarioMensual;
    }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
    public double getSalarioMensual() { return salarioMensual; }
    public void setSalarioMensual(double salarioMensual) { this.salarioMensual = salarioMensual; }

    @Override
    public String toString() {
        return super.toString() + ", Medico{" +
                "especialidad='" + especialidad + '\'' +
                ", salarioMensual=" + salarioMensual +
                '}';
    }
}
