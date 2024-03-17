package exercicios.Parte_1_exercsVariaveis;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        //2. Faca um programa que leia um numero real e o imprima.

        Scanner sc = new Scanner(System.in);
        double realNumber;

        System.out.println("Digite um numero real: ");
        realNumber = sc.nextDouble();

        System.out.println("O numero digitado eh : "  + realNumber);

        sc.close();
    }
}
