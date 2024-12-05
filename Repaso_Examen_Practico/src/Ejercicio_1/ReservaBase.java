package Ejercicio_1;

public class ReservaBase {
    protected String fecha;
    protected String horaInicio;
    protected String horaFin;
    protected Socio socio;

    public ReservaBase(String fecha, String horaInicio, String horaFin, Socio socio) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.socio = socio;
    }


    public String toString() {
        return "Fecha: " + fecha + ", Hora: " + horaInicio + " - " + horaFin + ", Socio: [" + socio.toString() + "]";
    }
}
