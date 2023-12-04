public class Main {
    public static void main(String[] args) {
        Aluno joao = new Aluno("123A", "Joao da Silva", 23);
        System.out.println(joao.nome);

        Aluno maria = new Aluno("123B", "Maria da Silva", 25);
        maria.fazerAniversario();
        System.out.println(maria);
        // POJO

    }
}