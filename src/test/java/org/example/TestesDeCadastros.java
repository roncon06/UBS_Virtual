package org.example;

import org.example.domain.Medico;
import org.example.domain.Usuario;
import org.example.services.ServicoMedicos;
import org.example.services.ServicoUsuarios;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestesDeCadastros {

    @Test
    public void testCadastrarUsuario() {
        ServicoUsuarios servicoUsuarios = new ServicoUsuarios();

        // Dados de teste
        String nome = "João";
        String endereco = "Rua ABC, 123";
        String telefone = "(11) 1234-5678";
        String id = "joao123";

        // Cadastrar o usuário
        servicoUsuarios.cadastrarUsuario(nome, endereco, telefone, id);

        // Verificar se o usuário foi cadastrado corretamente
        Usuario usuarioCadastrado = servicoUsuarios.getUsuarioID(id);
        assertNotNull(usuarioCadastrado);
        assertEquals(nome, usuarioCadastrado.getNome());
        assertEquals(endereco, usuarioCadastrado.getEndereco());
        assertEquals(telefone, usuarioCadastrado.getTelefone());
    }

    @Test
    public void testCadastrarMedico() {
        ServicoMedicos servicoMedicos = new ServicoMedicos();

        // Dados de teste
        String nomeMedico = "Dr. Carlos";
        String especialidade = "Cardiologia";
        String crm = "12345";

        // Cadastrar o médico
        servicoMedicos.cadastrarMedico(nomeMedico, especialidade, crm);

        // Verificar se o médico foi cadastrado corretamente
        Medico medicoCadastrado = servicoMedicos.getMedicoPorCRM(crm);
        assertNotNull(medicoCadastrado);
        assertEquals(nomeMedico, medicoCadastrado.getNome());
        assertEquals(especialidade, medicoCadastrado.getEspecialidade());
    }
}
