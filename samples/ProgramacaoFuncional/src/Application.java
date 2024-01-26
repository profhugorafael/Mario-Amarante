import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Application {
//    public static boolean ehPar(int number) {
//        return number%2 == 0;
//    }

    public static void main(String[] args) {
        List<Integer> sequencia = new ArrayList<>();

        sequencia.add(2);
        sequencia.add(3);
        sequencia.add(4);
        sequencia.add(5);
        sequencia.add(6);
        sequencia.add(7);
        sequencia.add(8);

        // Predicate: (T) -> boolean
        Predicate<Integer> meuPredicate = (numero) -> numero > 100;

        // expressao lambda = cria uma funcao como uma expressao matematica
        List<Integer> sequenciaFiltrada = sequencia
                .stream()
                .filter(number -> number%2 == 0) // expressao lambda
                .filter(x -> x > 5)
                .toList();

        // Consumer action: (T) -> void
        Consumer<Integer> impressorDeElementos = (elemento) -> System.out.println(elemento);

        sequenciaFiltrada.forEach(impressorDeElementos);

        // Function: (T) -> (R)
        Function<Integer, Integer> conversor = (number) -> (number*2);

        sequenciaFiltrada
                .stream()
                .map(conversor)
                .forEach(e -> System.out.println(e));

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Gabriel", 20, 1.8));
        pessoas.add(new Pessoa("Lucas", 25, 1.8));
        pessoas.add(new Pessoa("Alice", 20, 1.7));
        pessoas.add(new Pessoa("Beatriz", 30, 1.6));

        double sum = 0;

        sequencia.stream().allMatch(number -> number > 5);

        pessoas.stream()
                .map(pessoa -> pessoa.getAltura())
                .filter(altura -> altura >= 1.7)
                .forEach(elemento -> System.out.println(elemento));
    }
}