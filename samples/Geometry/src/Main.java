import model.Circle;
import model.Rectangle;
import model.Shape;
import model.enums.Color;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle(1.0, Color.BLUE, 3.0);

        // casting (escalacao) - geralmente tipo primitivo
        var resultado = (double)1 / 2;

        // upcasting - eh sempre seguro
        Shape s1 = new Circle(1.0, Color.BLACK, 4.3);
        Shape s2 = new Rectangle(2.0, Color.GREEN, 4.0, 5.0);

        Shape[] shapes = new Shape[2];

        shapes[0] = s1;
        shapes[1] = s2;

        // downcasting - nem sempre eh seguro
        // instanceof - instancia de
        if(s1 instanceof Circle aux) {
//            System.out.println(((Circle)s1).getRadius());
            System.out.println(aux.getRadius());
        }

        if(s2 instanceof Circle) {
            System.out.println(((Circle)s2).getRadius());
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        for(int numero: numeros) {
            System.out.println(numero);
        }

        numeros.remove(3);

        List<Shape> shapesList = new ArrayList<>();

        shapesList.add(s1);
        shapesList.add(s2);
        shapesList.add(new Rectangle(2.0, Color.PINK, 3.0, 4.0));

        System.out.println("Removido: " + shapesList.remove(s1));
        System.out.println("Removido: " + shapesList.remove(1));

        for (var shape : shapesList) {
            System.out.println(shape);
        }
    }
}