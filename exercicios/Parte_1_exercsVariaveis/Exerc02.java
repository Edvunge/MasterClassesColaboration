package exercicios.Parte_1_exercsVariaveis;


import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        //2. Fac¸a um programa que leia um n´umero real e o imprima.
        Scanner sc = new Scanner(System.in); // Scanner para ler o numero digitado.
        double realnumber;//Tipo de variavel.
        System.out.println("Digite um numero real: ");//solicitar digitacao do numero.
        realnumber = sc.nextDouble();//ler o numero real digitado.
        System.out.println("O numero digitado é : "  + realnumber);//imprimir o numero real.
        sc.close();//fecha o Scanner.
    }
}
