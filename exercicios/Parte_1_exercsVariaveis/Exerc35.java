package exercicios.Parte_1_exercsVariaveis;

import java.util.Scanner;

public class Exerc35 {
    // 35. Sejam a e b os catetos de um triangulo, onde a hipotenusa e
    // obtida pela equacao: hipotenusa = raiz(a2 + b2) faça um programa que receba os
    // valores de a e b e calcule
    // o valor da hipotenusa atraves da equacao. imprima o resultado dessa operaçao.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite o valor do cateto oposto: ");
        double catetoOposto = input.nextDouble();

        System.out.println("digite o valor do cateto adjacente: ");
        double catetoAdjancente = input.nextDouble();

        double hipotenusa = Math.sqrt((catetoOposto*catetoOposto) + (catetoAdjancente*catetoAdjancente));

        System.out.printf("valor da hipotenusa: %.2f \n",hipotenusa);
        input.close();
    }
}
