package gft;

import java.lang.Math;
import java.util.Scanner;

public class Sorteio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeroSorte = new int[4];
        int[] numeroInformado = new int[4];

        for (int i = 0; i < numeroSorte.length; i++) {
            numeroSorte[i] = (int) Math.random()*20;
        }

        System.out.println("Digite 4 números entre 1 e 20 para concorrer, sem repetir números");

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite o " + i + "o. número ");
            numeroInformado[i] = entrada.nextInt();
        }

        entrada.close();
    }
}
