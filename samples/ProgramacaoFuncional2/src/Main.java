import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));

        // predicate<T> = (T) -> boolean "tal que"

        boolean temCinco = numeros.stream().filter(numero -> numero == 5).toList().size() == 0;

        boolean temCincoMaisFacil = numeros.stream().anyMatch(numero -> numero == 5);

        boolean todosSaoImpares = numeros.stream().allMatch(numero -> numero % 2 == 1);

        Predicate<String> predicate1 = nome -> nome.length() > 0;

        // consumer<T> = (T) -> void
        Consumer<Integer> action1 = (numero) -> System.out.print(numero + ", ");
        numeros.forEach(System.out::println);

        // function<T, R> = (T) -> (R)
        // abacaxi

        Function<String, Integer> calculadorDeTamanho = texto -> texto.length();
        Function<String, String> capitalizer = palavra -> (
                palavra.substring(0, 1).toUpperCase() + palavra.substring(1).toLowerCase()
        );

        List<String> fruits = new ArrayList<>(List.of("banana", "peRA", "UVA", "ABacAXi"));

        fruits.stream().map(palavra -> (
                palavra.substring(0, 1).toUpperCase() + palavra.substring(1).toLowerCase()
        )).toList();

        // binaryOperator (T)
        BinaryOperator<Integer> binaryOperator = (numero1, numero2) -> numero1 * numero2;

        int soma = numeros.stream().reduce(0, (acc, numero) -> acc + numero);
        int produto = numeros.stream().reduce(1, (acc, numero) -> acc * numero);

        // textoAcc += fruit
        fruits.stream()
                .map(palavra -> (
                        palavra.substring(0, 1).toUpperCase() + palavra.substring(1).toLowerCase()
                ))
                .reduce("", (textoAcc, fruit) -> textoAcc + ", " + fruit);

        Optional<Integer> possivelNumero;

        // usuarioRepository.findById(1).map(usuario -> new Profile(usuario));
    }
}