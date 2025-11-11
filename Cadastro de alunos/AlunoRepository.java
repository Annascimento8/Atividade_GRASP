import java.util.ArrayList;
public class AlunoRepository {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
}


// Padrão GRASP aplicado: Low Coupling (Baixo Acoplamento)
// Justificativa:
//  - Esta classe é responsável apenas por armazenar e gerenciar
//    a lista de alunos.
//  - O Controller não precisa saber como os dados são guardados,
//    apenas que pode chamar "adicionarAluno" ou "getAlunos".
//  - Isso reduz dependências entre as classes e torna o código
//    mais flexível e fácil de manter.