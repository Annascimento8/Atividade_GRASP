public class AlunoController {
    private AlunoRepository repositorio;

    public AlunoController(AlunoRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void cadastrarAluno(String nome, String matricula) {
        Aluno aluno = new Aluno(nome, matricula);
        repositorio.adicionarAluno(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    public void listarAlunos() {
        System.out.println("\n--- Lista de Alunos ---");
        for (Aluno a : repositorio.getAlunos()) {
            a.mostrarDados();
        }
    }
}



// Padrões GRASP aplicados:
// 1) Controller
//    - Esta classe coordena as ações do sistema.
//    - Recebe as requisições (como cadastrar ou listar alunos)
//      e chama os métodos adequados do repositório.
//
// 2) Low Coupling 
//    - O controlador apenas conhece a interface pública do repositório.
//    - Não depende dos detalhes internos de como os alunos são salvos.
//    - Isso reduz dependências e torna o sistema mais fácil de alterar.