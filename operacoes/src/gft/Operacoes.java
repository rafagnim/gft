package gft;

import java.util.Scanner;


// obs.: priorizei as demais questões e não deu tempo de concluir esta...
public class Operacoes {

    public Operacoes() {

    }


    public static double adicao(double operador1, double operador2) {
        return operador1 + operador2;
    }

    public static double subtracao(double operador1, double operador2) {
        return operador1 - operador2;
    }

    public static double multiplicacao(double operador1, double operador2) {
        return operador1 * operador2;
    }

    public static double divisao(double operador1, double operador2) {
        return operador1 / operador2;
    }

    public static void main(String[] args) {
        double operador1 = 0;
        double operador2 = 0;
        int opcao = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculadora:\n=====================");


        System.out.println("Digite o perimeiro operador");
        operador1 = entrada.nextDouble();
        System.out.println("Digite o segundo operador");
        operador2 = entrada.nextDouble();

        do {
            System.out.println("Escolha a operacao desejada\n1-Adicao\n2-Subtracao\n3-multiplicacao\n4-divisao\5-mudar operadores");
            opcao = entrada.nextInt();
            switch(opcao) {
            case 1:
                System.out.println("O resultado da adicao é: " + adicao(operador1, operador2));
            break;
            case 2:
                System.out.println("O resultado da subtracao é: " + subtracao(operador1, operador2));
            break;
            case 3:
                System.out.println("O resultado da multiplicacao é: " + multiplicacao(operador1, operador2));
            break;
            case 4:
                System.out.println("O resultado da multiplicacao é: " + divisao(operador1, operador2));
            break;
            default:
            }  
        }  while (opcao != 5);

        entrada.close();
    }



}