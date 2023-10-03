package org.example.domain;

public class Notificacao {

    private String mensagem;
    private String dataEnvio;
    private boolean lida;

    public Notificacao(String mensagem, String dataEnvio, boolean lida) {
        this.mensagem = mensagem;
        this.dataEnvio = dataEnvio;
        this.lida = lida;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(String dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public boolean isLida() {
        return lida;
    }

    public void setLida(boolean lida) {
        this.lida = lida;
    }
}
