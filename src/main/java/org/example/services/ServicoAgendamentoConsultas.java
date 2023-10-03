package org.example.services;

import org.example.domain.Consulta;
import org.example.domain.Medico;
import org.example.domain.Usuario;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ServicoAgendamentoConsultas {

    private List<Consulta> consultasAgendadas;

    public ServicoAgendamentoConsultas() {
        consultasAgendadas = new ArrayList<>();
    }

    // Método para agendar uma nova consulta
    public void agendarConsulta(Medico medico, Usuario paciente, LocalDateTime dataHora) {
        Consulta consulta = new Consulta(medico, paciente, dataHora);
        consultasAgendadas.add(consulta);
    }

    // Método para listar todas as consultas agendadas
    public List<Consulta> listarConsultasAgendadas() {
        return consultasAgendadas;
    }

}
