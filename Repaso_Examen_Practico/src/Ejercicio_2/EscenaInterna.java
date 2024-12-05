package Ejercicio_2;

public class  EscenaInterna extends Escena {
    private String teatro;

    public EscenaInterna(String codigo, String descripcion, String teatro) {
        super(codigo, descripcion);
        this.teatro = teatro;
    }

    @Override
    public String toString() {
        return super.toString() + "Teatro: " + teatro + "\n";
    }
}
