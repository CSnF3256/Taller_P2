package Ejercicio_2;

import java.util.ArrayList;
import java.util.List;

abstract class Escena {
    private String codigo;
    private String descripcion;
    private List<Escenario> escenarios;

    public Escena(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.escenarios = new ArrayList<>();
    }

    public void agregarEscenario(Escenario escenario) {
        escenarios.add(escenario);
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Código: ").append(codigo).append("\n")
                .append("Descripción: ").append(descripcion).append("\n")
                .append("Escenarios:\n");
        for (Escenario escenario : escenarios) {
            sb.append(escenario).append("\n");
        }
        return sb.toString();
    }
}