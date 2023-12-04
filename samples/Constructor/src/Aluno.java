public class Aluno {

    // tem - atributos
    public String matricula;
    public String nome;
    public Integer idade;
    public Double nota;

    public Aluno(String matricula, String nome, int idade) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
    }

    // faz - metodo
    public void fazerAniversario() {
        idade++;
    }

    public int somar(int a, int b) {
        return a + b;
    }

    public void dizerOi(String nome) {
        System.out.println("Oi, " + nome);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", nota=" + nota +
                '}';
    }
}
