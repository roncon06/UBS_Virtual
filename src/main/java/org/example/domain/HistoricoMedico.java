package org.example.domain;

import java.util.ArrayList;
import java.util.List;

public class HistoricoMedico {

    private List<Consulta> consultas;
    private List<String> exames;
    private List<String> tratamentos;

    public HistoricoMedico() {
        consultas = new ArrayList<>();
        exames = new ArrayList<>();
        tratamentos = new ArrayList<>();
    }

    // Adicionar uma consulta ao histórico médico
    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    // Remover uma consulta do histórico médico
    public void removerConsulta(Consulta consulta) {
        consultas.remove(consulta);
    }

    // Adicionar um exame ao histórico médico
    public void adicionarExame(String nomeExame) {
        exames.add(nomeExame);
    }

    // Remover um exame do histórico médico
    public void removerExame(String nomeExame) {
        exames.remove(nomeExame);
    }

    // Adicionar um tratamento ao histórico médico
    public void adicionarTratamento(String nomeTratamento) {
        tratamentos.add(nomeTratamento);
    }

    // Remover um tratamento do histórico médico
    public void removerTratamento(String nomeTratamento) {
        tratamentos.remove(nomeTratamento);
    }

    // Getters para consultar o histórico médico
    public List<Consulta> getConsultas() {
        return consultas;
    }

    public List<String> getExames() {
        return exames;
    }

    public List<String> getTratamentos() {
        return tratamentos;
    }

}
