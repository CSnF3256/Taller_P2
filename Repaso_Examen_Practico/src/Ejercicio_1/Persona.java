package Ejercicio_1;

public class Persona {
    protected String nombre;
    protected String cedula;
    protected String direccion;
    protected String provincia;
    protected String ciudad;
    protected String telefono;

    public Persona(String nombre, String cedula, String direccion, String provincia, String ciudad, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }


    public String toString() {
        return "Nombre: " + nombre + ", Cédula: " + cedula + ", Dirección: " + direccion +
                ", Ciudad: " + ciudad + ", Provincia: " + provincia + ", Teléfono: " + telefono;
    }
}
