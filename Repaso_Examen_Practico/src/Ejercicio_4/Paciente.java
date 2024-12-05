package Ejercicio_4;

import java.time.LocalDate;
import java.util.List;

class Paciente extends Persona {
    private String historiaClinica;
    private String sexo;
    private String grupoSanguineo;
    private List<String> alergiasMedicamentos;

    public Paciente(String cedula, String nombre, String apellido, LocalDate fechaNacimiento,
                    String direccion, String ciudadProcedencia, String historiaClinica,
                    String sexo, String grupoSanguineo, List<String> alergiasMedicamentos) {
        super(cedula, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia);
        this.historiaClinica = historiaClinica;
        this.sexo = sexo;
        this.grupoSanguineo = grupoSanguineo;
        this.alergiasMedicamentos = alergiasMedicamentos;
    }

    public String getHistoriaClinica() { return historiaClinica; }
    public void setHistoriaClinica(String historiaClinica) { this.historiaClinica = historiaClinica; }
    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }
    public String getGrupoSanguineo() { return grupoSanguineo; }
    public void setGrupoSanguineo(String grupoSanguineo) { this.grupoSanguineo = grupoSanguineo; }
    public List<String> getAlergiasMedicamentos() { return alergiasMedicamentos; }
    public void setAlergiasMedicamentos(List<String> alergiasMedicamentos) { this.alergiasMedicamentos = alergiasMedicamentos; }

    @Override
    public String toString() {
        return super.toString() + ", Paciente{" +
                "historiaClinica='" + historiaClinica + '\'' +
                ", sexo='" + sexo + '\'' +
                ", grupoSanguineo='" + grupoSanguineo + '\'' +
                ", alergiasMedicamentos=" + alergiasMedicamentos +
                '}';
    }
}

