package Ejercicio_2;
public class EscenaExterna extends Escena {
    private Locacion locacion;
    private boolean esDiurna;

    public EscenaExterna(String codigo, String descripcion, Locacion locacion, boolean esDiurna) {
        super(codigo, descripcion);
        this.locacion = locacion;
        this.esDiurna = esDiurna;
    }


    public String toString() {
        return super.toString() + locacion + "\n" + "Es Diurna: " + (esDiurna ? "Sí" : "No") + "\n";
    }
}
