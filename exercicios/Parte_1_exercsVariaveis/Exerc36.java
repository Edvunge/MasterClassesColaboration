package exercicios.Parte_1_exercsVariaveis;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exerc36 {
     // 36. Leia a altura e o raio de um cilindro circular e
     // imprima o volume do cilindro.
    //  O volume de um cilindro circular e calculado por meio
    //  da seguinte formula: V = PI * raio2 * altura, onde PI = 3,141592.
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          final double PI = 3.141592; // forma de declaraçao de uma constante

          System.out.print("Insira o valor do raio: ");
          double raio = input.nextDouble();

          System.out.print("\nInsira o valor da altura: ");
          double altura = input.nextDouble();

          double volumeDoCilindroCircular = PI * (raio*raio) * altura;

          System.out.printf("\nO valor do volume Do Cilindro: %.2f",volumeDoCilindroCircular);

          input.close();
     }
}
