package com.cadastroalunos.repository;

import com.cadastroalunos.model.Aluno;

import java.util.ArrayList;


/* Padrão GRASP aplicado: Low Coupling (Baixo Acoplamento)
/ Justificativa:
/ - Esta classe é responsável apenas por armazenar e gerenciar
/ a lista de alunos.
/ - O Controller não precisa saber como os dados são guardados,
/ apenas que pode chamar "adicionarAluno" ou "getAlunos".
/ - Isso reduz dependências entre as classes e torna o código
/ mais flexível e fácil de manter.
*/ 

public class AlunoRepository {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    // CREATE
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    // READ (todos)
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    // READ (1) - Método auxiliar para Update e Delete
    public Aluno buscarPorMatricula(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null; // Não encontrado
    }

    // DELETE
    public boolean removerAluno(String matricula) {
        Aluno alunoParaRemover = buscarPorMatricula(matricula);
        if (alunoParaRemover != null) {
            alunos.remove(alunoParaRemover);
            return true; // Sucesso
        }
        return false; // Não encontrado
    }
}