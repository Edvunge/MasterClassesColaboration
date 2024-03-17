package exercicios.Parte_1_exercsVariaveis;

import java.util.Scanner;

public class exercCondicional {

    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um valor");
        int numero = sc.nextInt();

        if  (numero % 3 == 0) {
            System.out.println("Eh multiplo de 3");
        }
        else{
            System.out.println("Nao eh multiplo de 3");
        }
        sc.close();
    }
}