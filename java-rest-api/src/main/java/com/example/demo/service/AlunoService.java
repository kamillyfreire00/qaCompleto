package com.example.demo.service;

import com.example.demo.model.Aluno;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlunoService {

    private List<Aluno> alunos = new ArrayList<>();

    // REGRA 1: Nome não pode ser vazio
    // REGRA 2: CPF não pode ser duplicado
    public Aluno criarAluno(Aluno aluno) {

        if (aluno.getNome() == null || aluno.getNome().isEmpty()) {
            throw new RuntimeException("Nome não pode ser vazio");
        }

        boolean cpfExiste = alunos.stream()
                .anyMatch(a -> a.getCpf().equals(aluno.getCpf()));

        if (cpfExiste) {
            throw new RuntimeException("CPF já cadastrado");
        }

        alunos.add(aluno);
        return aluno;
    }

    // REGRA 3: Deve encontrar aluno existente
    public Aluno buscarPorId(Long id) {
        return alunos.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }

    // REGRA 4: Não pode deletar inexistente
    public void deletarPorId(Long id) {
        Aluno aluno = buscarPorId(id);
        alunos.remove(aluno);
    }
}