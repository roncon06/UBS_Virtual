package org.example.domain;

import java.util.List;

public class UBS {

    private String nome;
    private String endereco;
    private String horarioFuncionamento;
    private List<String> servicos;

    public UBS(String nome, String endereco, String horarioFuncionamento, List<String> servicos) {
        this.nome = nome;
        this.endereco = endereco;
        this.horarioFuncionamento = horarioFuncionamento;
        this.servicos = servicos;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public List<String> getServicos() {
        return servicos;
    }

    public void setServicos(List<String> servicos) {
        this.servicos = servicos;
    }
}
