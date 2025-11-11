public class Aluno {
    private String nome;
    private String matricula;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void mostrarDados() {
        System.out.println("Aluno: " + nome + " | Matrícula: " + matricula);
    }
}


// Nenhum padrão GRAPS aplicado.
// Justificativa: Esta é apenas uma classe de entidade simples,
// responsável por representar os dados de um aluno (nome e matrícula).
