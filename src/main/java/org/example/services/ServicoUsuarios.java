package org.example.services;

import org.example.domain.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ServicoUsuarios {
    // Lista para armazenar os usuários cadastrados (simulando um banco de dados em memória)
    private List<Usuario> usuariosCadastrados;

    public ServicoUsuarios() {
        usuariosCadastrados = new ArrayList<>();
    }

    // Método para cadastrar um novo usuário
    public void cadastrarUsuario(String nome, String endereco, String telefone, String id) {
        // Verifica se o ID do usuário já existe (deve ser único)
        if (getUsuarioComID(id)) {
            System.out.println("Erro: ID de usuário já existe. Escolha um ID único.");
            return;
        }

        // Cria um novo usuário
        Usuario novoUsuario = new Usuario(nome, endereco, telefone, id);

        // Adiciona o usuário à lista de usuários cadastrados
        usuariosCadastrados.add(novoUsuario);

        // Mensagem de confirmação
        System.out.println("Usuário cadastrado com sucesso!");
    }

    // Método auxiliar para verificar se um ID de usuário já existe
    private boolean getUsuarioComID(String id) {
        for (Usuario usuario : usuariosCadastrados) {
            if (usuario.getId().equals(id)) {
                return true; // ID já existe
            }
        }
        return false; // ID não encontrado
    }

    public Usuario getUsuarioID(String id) {
        for (Usuario usuario : usuariosCadastrados) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }
        return null;
    }

    // Método para listar todos os usuários cadastrados (apenas para fins de demonstração)
    public void listarUsuariosCadastrados() {
        for (Usuario usuario : usuariosCadastrados) {
            System.out.println("Nome: " + usuario.getNome() +
                    ", Endereço: " + usuario.getEndereco() +
                    ", Telefone: " + usuario.getTelefone() +
                    ", ID: " + usuario.getId());
        }
    }
}
