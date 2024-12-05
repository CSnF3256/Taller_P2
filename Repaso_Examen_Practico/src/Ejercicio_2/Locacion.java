package Ejercicio_2;
public class Locacion {
    private String codigo;
    private String direccion;
    private String descripcion;

    public Locacion(String codigo, String direccion, String descripcion) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Locación:\n" +
                "Código: " + codigo + "\n" +
                "Dirección: " + direccion + "\n" +
                "Descripción: " + descripcion + "\n";
    }
}
