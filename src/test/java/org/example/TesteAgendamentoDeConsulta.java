package org.example;

import org.example.domain.Consulta;
import org.example.domain.Medico;
import org.example.domain.Usuario;
import org.example.services.ServicoAgendamentoConsultas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TesteAgendamentoDeConsulta {
    private ServicoAgendamentoConsultas servicoAgendamento;
    private Medico medico;
    private Usuario paciente;

    @BeforeEach
    public void setUp() {
        servicoAgendamento = new ServicoAgendamentoConsultas(); // Inicialize o serviço aqui
        medico = new Medico("Dr. Carlos", "Cardiologia", "12345");
        paciente = new Usuario("João", "Rua XYZ, 456", "(11) 5678-1234", "joao123");
    }

    @Test
    public void testAgendarConsulta() {
        LocalDateTime dataHoraConsulta = LocalDateTime.of(2023, 10, 20, 10, 0); // Exemplo de data e hora

        // Agendar uma consulta
        servicoAgendamento.agendarConsulta(medico, paciente, dataHoraConsulta);

        // Verificar se a consulta foi agendada corretamente
        List<Consulta> consultasAgendadas = servicoAgendamento.listarConsultasAgendadas();
        assertNotNull(consultasAgendadas);
        assertEquals(1, consultasAgendadas.size());

        Consulta consultaAgendada = consultasAgendadas.get(0);
        assertEquals(medico, consultaAgendada.getMedico());
        assertEquals(paciente, consultaAgendada.getPaciente());
        assertEquals(dataHoraConsulta, consultaAgendada.getDataHora());
    }
}
