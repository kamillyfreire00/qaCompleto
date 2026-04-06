package com.example.demo.service;

import com.example.demo.model.Aluno;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlunoServiceTest {

    private AlunoService service = new AlunoService();

    // ✅ TESTE 1
    @Test
    void deveCriarAlunoComSucesso() {
        Aluno aluno = new Aluno(1L, "Kamilly", "123", "k@k.com");

        Aluno resultado = service.criarAluno(aluno);

        assertNotNull(resultado);
        assertEquals("Kamilly", resultado.getNome());
    }

    // ❌ TESTE 2
    @Test
    void naoDeveCriarAlunoSemNome() {
        Aluno aluno = new Aluno(1L, "", "123", "k@k.com");

        assertThrows(RuntimeException.class, () -> {
            service.criarAluno(aluno);
        });
    }

    // ❌ TESTE 3
    @Test
    void naoDevePermitirCpfDuplicado() {
        Aluno aluno1 = new Aluno(1L, "Kamilly", "123", "k@k.com");
        Aluno aluno2 = new Aluno(2L, "Ana", "123", "a@a.com");

        service.criarAluno(aluno1);

        assertThrows(RuntimeException.class, () -> {
            service.criarAluno(aluno2);
        });
    }

    // 🔍 TESTE 4
    @Test
    void deveBuscarAlunoPorId() {
        Aluno aluno = new Aluno(1L, "Kamilly", "123", "k@k.com");

        service.criarAluno(aluno);

        Aluno resultado = service.buscarPorId(1L);

        assertEquals("Kamilly", resultado.getNome());
    }

    // ❌ TESTE 5
    @Test
    void deveLancarErroSeAlunoNaoExistir() {
        assertThrows(RuntimeException.class, () -> {
            service.buscarPorId(99L);
        });
    }

    // 🗑️ TESTE 6
    @Test
    void deveDeletarAluno() {
        Aluno aluno = new Aluno(1L, "Kamilly", "123", "k@k.com");

        service.criarAluno(aluno);
        service.deletarPorId(1L);

        assertThrows(RuntimeException.class, () -> {
            service.buscarPorId(1L);
        });
    }
}