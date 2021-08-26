package gft;

import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um intervalo de números maiores que 0, para cálculao dos números pares:");
        System.out.println("Informe o valor inicial");
        int inicial = entrada.nextInt();
        System.out.println("Informe o valor final");
        int fim = entrada.nextInt();

        System.out.print("Saida: ");
        for (int i = inicial; i <= fim; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        entrada.close();
    }
    
}
