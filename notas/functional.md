# Programação Funcional

- paradigma procedural: passo a passo
- paradigma da orientacao a objetos: abstrair, encapsular, polimorfismo, herança
- paradigma funcional

filtro: `(condicao) -> boolean`

```java
public boolean ehPar(int number) {
  return number%2 == 0;
}

public void filtraLista(Lista<Integer> inteiros, var filtro) {

}
```

## Problema motivador

Quando estamos em programacao procedural apenas conseguimos dizer "o que" filtrar, ou "o que" fazer, porem nao conseguimos de maneira dinamica dizer "como" filtrar ou "como" fazer.

> Como (programacao funcional) vs. O que (Programacao imperativa/procedural)

## Streams no Java

- Fluxo de dados
- A stream ela eh fechada para consulta
- Seu objetivo eh agrupar e otimizar operacoes
- Usam programacao funcional permitindo muita flexibilidade no uso

```java
List<Integer> sequencia = new ArrayList<>();

sequencia.add(2);
sequencia.add(3);
sequencia.add(4);
sequencia.add(5);

List<Integer> result = sequencia.stream()
  .filter(ehPar) // operacao intermediaria
  .filter(maiorQue100) // operacao intermediaria
  .toList(); // operacao terminal
```

### Operacoes intermediarias

1. filter: (elemento) -> boolean
2. map: (elementoDoTipo1) -> (elementoDoTipo2)
3. distinct: () -> ()
4. peek: (elemento) -> void

### Operacoes terminais

1. forEach: (elemento) -> void
2. toArray: () -> []

## Expressoes Lambda
