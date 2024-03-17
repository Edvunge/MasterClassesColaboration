package exercicios.Parte_2_exercsEstruturas;

import java.util.Scanner;

public class Exerc04 {
    // 4. Faça um programa que leia umnúmero e informe se ele é ou não divisível por 5.
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.println("digite um numero: ");
        int num = input.nextInt();

        if (num % 5 == 0) {
            System.out.println("eh divisivel por 5");
        } else {
            System.out.println("nao eh divisivel por 5");
        }
        input.close();
    }
}
