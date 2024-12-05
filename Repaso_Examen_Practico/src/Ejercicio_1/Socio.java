package Ejercicio_1;

public class Socio extends Persona {
    private int cuota;

    public Socio(String nombre, String cedula, String direccion, String provincia, String ciudad, String telefono, int cuota) {
        super(nombre, cedula, direccion, provincia, ciudad, telefono);
        this.cuota = cuota;
    }

    public int getCuota() {
        return cuota;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cuota: $" + cuota;
    }
}
