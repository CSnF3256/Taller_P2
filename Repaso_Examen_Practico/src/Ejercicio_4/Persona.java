package Ejercicio_4;
import java.util.Comparator;
import java.time.LocalDate;
class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String ciudadProcedencia;

    public Persona(String cedula, String nombre, String apellido, LocalDate fechaNacimiento,
                   String direccion, String ciudadProcedencia) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.ciudadProcedencia = ciudadProcedencia;
    }

    // Getters y setters
    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public String getCiudadProcedencia() { return ciudadProcedencia; }
    public void setCiudadProcedencia(String ciudadProcedencia) { this.ciudadProcedencia = ciudadProcedencia; }

    @Override
    public String toString() {
        return "Persona{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", direccion='" + direccion + '\'' +
                ", ciudadProcedencia='" + ciudadProcedencia + '\'' +
                '}';
    }
}
