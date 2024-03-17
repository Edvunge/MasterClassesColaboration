package exercicios.Parte_2_exercsEstruturas;

import java.util.Scanner;

public class ExercCategoriaCondIfsAndElse {
    /*
Uma empresa irá dar um aumento de salário aos seus
funcionários de acordo com a categoria de cada empregado.

O aumento seguirá a seguinte regra:

• Funcionários das categorias
A, C, F, e H ganharão 10% de aumento sobre o salário;

• Funcionários das categorias B, D, E, I, J e T
ganharão 15% de aumento sobre o salário;

• Funcionários das categorias K e R ganharão 25%
de aumento sobre o salário;

• Funcionários das categorias L, M, N, O, P, Q e S
ganharão 35% de aumento sobre o salário;

• Funcionários das categorias U, V, X, Y, W e Z
ganharão 50% de aumento sobre o salário.

Faça um algoritmo que escreva nome,
categoria e salário reajustado de cada empregado.

*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // SECCAO DE VARIAVEIS
        String nomeFuncionario;
        double salario;
        double salarioReajustado;
        String categoria;
        double aumento;
        double percentagem;


        System.out.print("Digite o seu nome: ");
        nomeFuncionario = input.next();


        System.out.print("Digite o seu salario: ");
        salario = input.nextDouble();


        System.out.print("\nQual eh a sua categoria de funcionario: ");
        System.out.print("\nAs categorias vao de  (A, B, C .... Z):  ");
        categoria = input.next();


        if (categoria.equals("A") || categoria.equals("C") || categoria.equals("F") || categoria.equals("H")) {
            // percentagem de aumento 10%
            percentagem = 10;

            aumento = salario * percentagem/ 100;
            salarioReajustado = salario + aumento;

            System.out.print("\nNome do funcionario: " + nomeFuncionario);
            System.out.print("\nCategoria: " + categoria);
            System.out.printf("\nSalario: %.2f" , salario);
            System.out.printf("\nSalario Reajustado: %.2f" , salarioReajustado);
        } else if (categoria.equals("B") || categoria.equals("D") || categoria.equals("E") || categoria.equals("I") || categoria.equals("J") || categoria.equals("T") ) {
            // percentagem de aumento 15%
            percentagem = 15;

            aumento = salario * percentagem/ 100;
            salarioReajustado = salario + aumento;

            System.out.print("\nNome do funcionario: " + nomeFuncionario);
            System.out.print("\nCategoria: " + categoria);
            System.out.printf("\nSalario: %.2f" , salario);
            System.out.printf("\nSalario Reajustado: %.2f" , salarioReajustado);
        } else if (categoria.equals("K") || categoria.equals("R")) {
            // percentagem de aumento 25%
            percentagem = 25;

            aumento = salario * percentagem/ 100;
            salarioReajustado = salario + aumento;

            System.out.print("\nNome do funcionario: " + nomeFuncionario);
            System.out.print("\nCategoria: " + categoria);
            System.out.printf("\nSalario: %.2f" , salario);
            System.out.printf("\nSalario Reajustado: %.2f" , salarioReajustado);
        } else if (categoria.equals("L") || categoria.equals("M") || categoria.equals("N") || categoria.equals("O") || categoria.equals("P") || categoria.equals("Q") || categoria.equals("S")) {
            // percentagem de aumento 35%
            percentagem = 35;

            aumento = salario * percentagem/ 100;
            salarioReajustado = salario + aumento;

            System.out.print("\nNome do funcionario: " + nomeFuncionario);
            System.out.print("\nCategoria: " + categoria);
            System.out.printf("\nSalario: %.2f" , salario);
            System.out.printf("\nSalario Reajustado: %.2f" , salarioReajustado);
        } else if (categoria.equals("U") || categoria.equals("V") || categoria.equals("X") || categoria.equals("Y") || categoria.equals("W") || categoria.equals("Z")) {
            // percentagem de aumento 50
            percentagem = 50;

            aumento = salario * percentagem/ 100;
            salarioReajustado = salario + aumento;

            System.out.print("\nNome do funcionario: " + nomeFuncionario);
            System.out.print("\nCategoria: " + categoria);
            System.out.printf("\nSalario: %.2f" , salario);
            System.out.printf("\nSalario Reajustado: %.2f" , salarioReajustado);
        } else {
            System.out.println("ESCOLHA INVALIDA, LAMENTO :) ");
        }
        input.close();
    }
}

/*
1. REFAÇA O MESMO EXERCICIO USANDO SWITCH CASE
    NOME DO EXERCICIO: ExercCategoriaCondSWITCHcase
    REGRA DO COMMIT: ExercCategoriaCondSWITCHcase

2. REFAÇA O MESMO EXERCICIO ACEITANDO (A e a, B e b)
    NOME DO EXERCICIO: ExercCategoriaCondIfsAndElse_2
    REGRA DO COMMIT: ExercCategoriaCondIfsAndElse_2
 */