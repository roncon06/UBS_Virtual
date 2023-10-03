package org.example.services;

import org.example.domain.Medico;

import java.util.ArrayList;
import java.util.List;

public class ServicoMedicos {
    // Lista para armazenar os médicos cadastrados (simulando um banco de dados em memória)
    private List<Medico> medicosCadastrados;

    public ServicoMedicos() {
        medicosCadastrados = new ArrayList<>();
    }

    // Método para cadastrar um novo médico
    public void cadastrarMedico(String nome, String especialidade, String crm) {
        // Verifica se o CRM do médico já existe (deve ser único)
        if (getMedicoComCRM(crm)) {
            System.out.println("Erro: CRM do médico já existe. Escolha um CRM único.");
            return;
        }

        // Cria um novo médico
        Medico novoMedico = new Medico(nome, especialidade, crm);

        // Adiciona o médico à lista de médicos cadastrados
        medicosCadastrados.add(novoMedico);

        // Mensagem de confirmação
        System.out.println("Médico cadastrado com sucesso!");
    }

    // Método auxiliar para verificar se um CRM de médico já existe
    private boolean getMedicoComCRM(String crm) {
        for (Medico medico : medicosCadastrados) {
            if (medico.getCrm().equals(crm)) {
                return true; // CRM já existe
            }
        }
        return false; // CRM não encontrado
    }


    // Método auxiliar para buscar um médico pelo CRM
    public Medico getMedicoPorCRM(String crm) {
        for (Medico medico : medicosCadastrados) {
            if (medico.getCrm().equals(crm)) {
                return medico; // Retorna o médico encontrado
            }
        }
        return null; // Retorna null se o médico não for encontrado
    }


    // Método para listar todos os médicos cadastrados (apenas para fins de demonstração)
    public void listarMedicosCadastrados() {
        for (Medico medico : medicosCadastrados) {
            System.out.println("Nome: " + medico.getNome() +
                    ", Especialidade: " + medico.getEspecialidade() +
                    ", CRM: " + medico.getCrm());
        }
    }
}
