import model.*;
import model.enums.Color;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AbstractShape s1 = new Circle(Color.BLUE, 1.0, 3.0);
        AbstractShape s2 = new Rectangle(Color.PURPLE, 2.0, 3.0, 4.0);

        Shape s3 = new Circle();

        List<Integer> inteiros = new ArrayList<>();

        System.out.println(s1.getArea());
        System.out.println(s2.getPerimeter());

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Joao", 20));
        pessoas.add(new Pessoa("Pedro", 22));
        pessoas.add(new Pessoa("Alberto", 23));
        pessoas.add(new Pessoa("Beatriz", 23));
        pessoas.add(new Pessoa("Carla", 19));

        Collections.sort(pessoas, (p1, p2) -> {
            var response = (-1) * Integer.compare(p1.getIdade(), p2.getIdade());

            if(response!=0) return response;

            return p1.getNome().compareTo(p2.getNome());
        });

        pessoas.forEach(System.out::println);
    }
}