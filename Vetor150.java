package exerciciosRevisao07;

import java.util.Scanner;

public class Vetor150 {
    public static void main(String[] args) {
        int[] vetor = new int[50];
        int number = 100;
        for (int i = 0; i < vetor.length; i ++){
            number++;
            System.out.println("posição " + i + " número" + number);
        }
    }
}
