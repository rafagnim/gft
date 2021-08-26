package gft;

import java.lang.Math;
import java.util.Scanner;

public class Sorteio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeroSorte = new int[4];
        int[] numeroInformado = new int[4];

        for (int i = 0; i < numeroSorte.length; i++) {
            numeroSorte[i] = (int) (Math.random()*20);
        }

        boolean condicao = false;

        while (!condicao) {

            System.out.println("Digite 4 números entre 1 e 20 para concorrer, sem repetir números");

            for (int i = 0; i < 4; i++) {
                System.out.println("Digite o " + (i+ 1) + "o. número ");
                numeroInformado[i] = entrada.nextInt();
            }
            if ((numeroInformado[0] != numeroInformado[1]) && 
                (numeroInformado[0] != numeroInformado[2]) &&
                (numeroInformado[0] != numeroInformado[3]) &&
                (numeroInformado[1] != numeroInformado[2]) &&
                (numeroInformado[1] != numeroInformado[3]) &&
                (numeroInformado[2] != numeroInformado[3])) {
                    condicao = true;
                }
        }

        System.out.println("Números sorteados:");
        for (int i = 0; i < 4; i++) {
            System.out.println(numeroSorte[i] + " ");
        }

        System.out.println("Números informados:");
        for (int i = 0; i < 4; i++) {
            System.out.println(numeroInformado[i] + " ");
        }

        int contadorSorteio = 0;

        if (numeroInformado [0] == numeroSorte[1] || numeroInformado [0] == numeroSorte[2] ||
            numeroInformado [0] == numeroSorte[3] || numeroInformado [0] = numeroSorte[0]) {
            contadorSorteio++;
        }
        if (numeroInformado [1] == numeroSorte[2] || numeroInformado [1] == numeroSorte[3]) {
            contadorSorteio++;
        }

        if (numeroInformado [2] == numeroSorte[3]) {
            contadorSorteio++;
        }
        if (numeroInformado [3] == numeroSorte[3]) {
            contadorSorteio++;
        }
        
        if (contadorSorteio == 4) {
            System.out.println("Você ganhou");
        }

        /// não deu tempo de conferir...

        entrada.close();
    }
}
