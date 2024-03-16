package exercicios.Parte_1_exercsVariaveis;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        // 1. Faca um programa que leia um numero inteiro e o imprima.

        // Retificaçao do exercicio: 16/03/2024 edvunge 20:10min

        // como receber comndos pelo teclado, neste exercio
        // regra commit: "exerc01_update_teclado"

        Scanner sc = new Scanner(System.in);
        //int d;// não esta errado mais recomenda-se que se use nome de variaveis mais intuitivos
        int number;

        System.out.println("Digite um numero inteiro: ");
        number = sc.nextInt();

        System.out.println("Numero inteiro: "  + number);


        sc.close(); // descubrit para que serve o close()
    }
}
