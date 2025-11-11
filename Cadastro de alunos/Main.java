public class Main {
    public static void main(String[] args) {
        // Criamos o repositório e o controlador
        AlunoRepository repositorio = new AlunoRepository();
        AlunoController controller = new AlunoController(repositorio);

        // Executamos as ações do sistema
        controller.cadastrarAluno("Anna Júlia", "A001");
        controller.cadastrarAluno("Anna Beatris", "A002");

        controller.listarAlunos();
    }
}


// Nenhum padrão GRAPS aplicado.
// Justificativa:
//  - Esta classe apenas executa o programa.
//  - Ela cria o repositório e o controlador, e chama as ações.