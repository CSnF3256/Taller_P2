package Ejercicio_2;

public class Toma {
    private int numeroToma;
    private double metrosPelícula;
    private String codigoBobina;

    public Toma(int numeroToma, double metrosPelícula, String codigoBobina) {
        this.numeroToma = numeroToma;
        this.metrosPelícula = metrosPelícula;
        this.codigoBobina = codigoBobina;
    }

    @Override
    public String toString() {
        return "Número de Toma: " + numeroToma + ", Metros de Película: " + metrosPelícula + ", Código de Bobina: " + codigoBobina;
    }
}
