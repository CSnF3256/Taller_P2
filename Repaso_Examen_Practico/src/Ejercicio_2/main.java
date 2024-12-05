package Ejercicio_2;


import javax.swing.*;

public class main {
    public static void main(String[] args) {
        String titulo = JOptionPane.showInputDialog("Ingrese el título de la película:");
        Pelicula pelicula = new Pelicula(titulo);

        int continuar;
        do {
            String codigoEscena = JOptionPane.showInputDialog("Ingrese el código de la escena:");
            String descripcionEscena = JOptionPane.showInputDialog("Ingrese la descripción de la escena:");
            String[] opciones = {"Escena Interna", "Escena Externa"};
            int tipoEscena = JOptionPane.showOptionDialog(null, "Seleccione el tipo de escena:", "Tipo de Escena",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            Escena escena;

            if (tipoEscena == 0) { // Escena Interna
                String teatro = JOptionPane.showInputDialog("Ingrese el nombre del teatro:");
                escena = new EscenaInterna(codigoEscena, descripcionEscena, teatro);
            } else { // Escena Externa
                String codigoLocacion = JOptionPane.showInputDialog("Ingrese el código de la locación:");
                String direccionLocacion = JOptionPane.showInputDialog("Ingrese la dirección de la locación:");
                String descripcionLocacion = JOptionPane.showInputDialog("Ingrese la descripción de la locación:");
                Locacion locacion = new Locacion(codigoLocacion, direccionLocacion, descripcionLocacion);
                boolean esDiurna = JOptionPane.showConfirmDialog(null, "¿Es una escena diurna?") == JOptionPane.YES_OPTION;
                escena = new EscenaExterna(codigoEscena, descripcionEscena, locacion, esDiurna);
            }

            int numEscenarios = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de escenarios para esta escena:"));
            for (int i = 0; i < numEscenarios; i++) {
                String codigoEscenario = JOptionPane.showInputDialog("Ingrese el código del escenario:");
                String descripcionEscenario = JOptionPane.showInputDialog("Ingrese la descripción del escenario:");
                Escenario escenario = new Escenario(codigoEscenario, descripcionEscenario);

                int numTomas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de tomas para este escenario:"));
                for (int j = 0; j < numTomas; j++) {
                    int numeroToma = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de toma:"));
                    double metrosPelicula = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los metros de película utilizados:"));
                    String codigoBobina = JOptionPane.showInputDialog("Ingrese el código de la bobina:");
                    escenario.agregarToma(new Toma(numeroToma, metrosPelicula, codigoBobina));
                }
                escena.agregarEscenario(escenario);
            }

            pelicula.agregarEscena(escena);
            continuar = JOptionPane.showConfirmDialog(null, "¿Desea agregar otra escena?");
        } while (continuar == JOptionPane.YES_OPTION);

        pelicula.mostrarEscenas();
    }
}
