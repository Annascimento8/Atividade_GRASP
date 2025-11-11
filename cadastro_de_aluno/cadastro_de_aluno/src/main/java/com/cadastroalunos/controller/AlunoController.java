package com.cadastroalunos.controller;

import com.cadastroalunos.model.Aluno;
import com.cadastroalunos.repository.AlunoRepository;
import java.util.ArrayList;

/*
Padrões GRASP aplicados:
1) Controller
- Esta classe coordena as ações do sistema.
- Recebe as requisições (como cadastrar ou listar alunos)
e chama os métodos adequados do repositório.

2) Low Coupling
- O controlador apenas conhece a interface pública do repositório.
- Não depende dos detalhes internos de como os alunos são salvos.
- Isso reduz dependências e torna o sistema mais fácil de alterar.
*/ 

public class AlunoController {
    private AlunoRepository repositorio;

    public AlunoController(AlunoRepository repositorio) {
        this.repositorio = repositorio;
    }

    // CREATE
    public void cadastrarAluno(String nome, String matricula) {
        Aluno aluno = new Aluno(nome, matricula);
        repositorio.adicionarAluno(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    // READ (All)
    public void listarAlunos() {
        System.out.println("\n--- Lista de Alunos Cadastrados ---");
        ArrayList<Aluno> alunos = repositorio.getAlunos();

        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        for (Aluno aluno : alunos) {
            aluno.mostrarDados();
        }
    }

    // READ (Single)
    public void buscarAluno(String matricula) {
        Aluno aluno = repositorio.buscarPorMatricula(matricula);
        if (aluno != null) {
            System.out.println("\n--- Aluno Encontrado ---");
            aluno.mostrarDados();
        } else {
            System.out.println("Aluno com matrícula " + matricula + " não encontrado.");
        }
    }

    // UPDATE
    public void atualizarAluno(String matricula, String novoNome) {
        Aluno aluno = repositorio.buscarPorMatricula(matricula);
        if (aluno != null) {
            aluno.setNome(novoNome);
            System.out.println("Aluno atualizado com sucesso!");
            aluno.mostrarDados();
        } else {
            System.out.println("Aluno com matrícula " + matricula + " não encontrado para atualização.");
        }
    }

    // DELETE
    public void removerAluno(String matricula) {
        boolean removido = repositorio.removerAluno(matricula);
        if (removido) {
            System.out.println("Aluno " + matricula + " removido com sucesso!");
        } else {
            System.out.println("Aluno com matrícula " + matricula + " não encontrado para remoção.");
        }
    }
}