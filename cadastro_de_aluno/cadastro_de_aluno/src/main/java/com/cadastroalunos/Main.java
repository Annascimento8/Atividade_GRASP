package com.cadastroalunos;

import com.cadastroalunos.controller.AlunoController;
import com.cadastroalunos.repository.AlunoRepository;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AlunoRepository repositorio = new AlunoRepository();
        AlunoController controller = new AlunoController(repositorio);
        
        Scanner scanner = new Scanner(System.in);

        // Opcional: Pré-popular alguns dados para teste
        controller.cadastrarAluno("Anna Júlia", "A001");
        controller.cadastrarAluno("Anna Beatriz", "A002");

        while (true) {
            System.out.println("\n--- Sistema de Cadastro de Alunos ---");
            System.out.println("1: Cadastrar Aluno");
            System.out.println("2: Listar Alunos");
            System.out.println("3: Atualizar Aluno (por matrícula)");
            System.out.println("4: Remover Aluno (por matrícula)");
            System.out.println("5: Buscar Aluno (por matrícula)");
            System.out.println("0: Sair");
            System.out.print("Escolha uma opção: ");

            String escolha = scanner.nextLine();

            switch (escolha) {
                case "1":
                    // CREATE
                    System.out.print("Digite o nome do aluno: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a matrícula do aluno: ");
                    String matricula = scanner.nextLine();
                    controller.cadastrarAluno(nome, matricula);
                    break;
                
                case "2":
                    // READ (All)
                    controller.listarAlunos();
                    break;
                
                case "3":
                    // UPDATE
                    System.out.print("Digite a matrícula do aluno que deseja atualizar: ");
                    String matriculaAtualizar = scanner.nextLine();
                    // (Poderíamos verificar se ele existe primeiro, mas o controller já faz isso)
                    System.out.print("Digite o NOVO nome do aluno: ");
                    String novoNome = scanner.nextLine();
                    controller.atualizarAluno(matriculaAtualizar, novoNome);
                    break;
                
                case "4":
                    // DELETE
                    System.out.print("Digite a matrícula do aluno que deseja remover: ");
                    String matriculaRemover = scanner.nextLine();
                    controller.removerAluno(matriculaRemover);
                    break;

                case "5":
                    // READ (Single)
                    System.out.print("Digite a matrícula do aluno que deseja buscar: ");
                    String matriculaBuscar = scanner.nextLine();
                    controller.buscarAluno(matriculaBuscar);
                    break;

                case "0":
                    // SAIR
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        }
    }
}