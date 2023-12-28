# Herança

## Herança

classes podem extender outras classas

## Classes Abstratas

classes abstratas sao classes que nao produzem objetos, servem apenas para serem continuadas por outras.

```java
public enum Cor {
  AZUL,
  VERMELHO
}

public abstract class FormaGeometrica {

  private Cor cor;
  private double espessura;

  // constructors, getters, setters, to string...

  public double area() {
    return -1;
  }

}

public class Circulo extends FormaGeometrica {

  private double raio;

  // constructors, getters, setters, to string...

  @Override
  public double area() {
    return 3.14*raio*raio;
  }

}
```

## Metodos abstratos

metodos abstratos sao chamados de contratos

```java
public abstract class FormaGeometrica {

  private Cor cor;
  private double espessura;

  // constructors, getters, setters, to string...

  // contrato com as classes filhas
  public abstract double area();

}

public class Circulo extends FormaGeometrica {

  private double raio;

  // constructors, getters, setters, to string...

  public double area() {
    return 3.14*raio*raio;
  }

}
```
