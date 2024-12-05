package Ejercicio_4;

import java.time.LocalDate;

class Cita {
    private Paciente paciente;
    private Medico medico;
    private LocalDate fecha;
    private String hora;

    public Cita(Paciente paciente, Medico medico, LocalDate fecha, String hora) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "paciente=" + paciente.getNombre() +
                ", medico=" + medico.getNombre() +
                ", fecha=" + fecha +
                ", hora='" + hora + '\'' +
                '}';
    }
}

