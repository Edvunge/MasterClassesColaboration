package exercicios.Parte_1_exercsVariaveis;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        // 1. Faca um programa que leia um numero inteiro e o imprima.
        int numero = 2;

        System.out.println("numero inteiro: " + numero);

        // como receber comndos pelo teclado, neste exercio
        // regra commit: "exerc01_update_teclado"
         Scanner sc = new Scanner(System.in);
        int d;
        System.out.println("Digite um numero inteiro: ");
        d= sc.nextInt();
        System.out.println("Numero inteiro: "  + d);
        sc.nextInt();
    }
}
