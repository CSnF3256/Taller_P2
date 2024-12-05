package Ejercicio_2;

import java.util.ArrayList;
import java.util.List;

public class Escenario {
    private String codigo;
    private String descripcion;
    private List<Toma> tomas;

    public Escenario(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tomas = new ArrayList<>();
    }

    public void agregarToma(Toma toma) {
        tomas.add(toma);
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Código: ").append(codigo).append("\n")
                .append("Descripción: ").append(descripcion).append("\n")
                .append("Tomas:\n");
        for (Toma toma : tomas) {
            sb.append(toma).append("\n");
        }
        return sb.toString();
    }}

