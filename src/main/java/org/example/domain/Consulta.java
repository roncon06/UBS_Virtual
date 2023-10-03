package org.example.domain;

import java.time.LocalDateTime;

public class Consulta {
    private Medico medico;
    private Usuario paciente;
    private LocalDateTime dataHora;

    public Consulta(Medico medico, Usuario paciente, LocalDateTime dataHora) {
        this.medico = medico;
        this.paciente = paciente;
        this.dataHora = dataHora;
    }

    // Getters e setters para os campos
    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Usuario getPaciente() {
        return paciente;
    }

    public void setPaciente(Usuario paciente) {
        this.paciente = paciente;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
