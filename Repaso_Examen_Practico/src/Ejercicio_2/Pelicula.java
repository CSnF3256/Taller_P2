package Ejercicio_2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

// Clase principal Pelicula
public class Pelicula {
    private String titulo;
    private List<Escena> escenas;

    public Pelicula(String titulo) {
        this.titulo = titulo;
        this.escenas = new ArrayList<>();
    }

    public void agregarEscena(Escena escena) {
        escenas.add(escena);
    }

    public void mostrarEscenas() {
        StringBuilder sb = new StringBuilder("\nEscenas de la película \"" + titulo + "\":\n");
        for (Escena escena : escenas) {
            sb.append(escena).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
