# Improving POO

## keyword `final`

A palavra final indica que o metodo ou variavel nao podem mais ser sobreescritos.

## keyword `static`

Ser estatico significa que a variável ou método é única em relação aos objetos. Isto é, não depende de um objeto para existir e ser chamda.

```java
public class Circle {
  public static final double TAXA_SELIC = 3.14159265;
  private double radius;

  // construtor, getter, setter, toString

  public static double calculateArea(double radius) {
    return PI*radius*radius;
  }

}
```

```java
double pi = Circle.PI;

Circle.calculateArea(2.0);

Math.pow(2, 3); // chamada estatica
```

```java
public class Constraints {
  public static double MINHA_CONSTANTE_1 = 3.1415;
  public static double ONE_DAY_IN_HOURS = 24;
}
```

## ...entendendo o método main()

```java
public class App {
  public static void main(String[] args) {
    // entrypoint = ponto de entrada
  }
}
```

é necessário que a `main` seja estática para que exista um, e somente um, ponto de entrada no seu programa, além dele ser independente da criação de um objeto associado ao programa.

`javac ... projeto.java App [args]`

`ler.java arquivo.txt`

## Design Patterns com `static`

```java
import java.util.Date;

// ...

Date dataDeHoje = new Date(2323223232L);
Date data = new Date(2023, 12, 28);
```

com a biblioteca `LocalDate`

```java
LocalDateTime dataEHora = LocalDateTime.of(2023, 12, 28);
LocalTime horario = LocalTime.of(13, 48, 50);
LocalDate agora = LocalDate.now();
