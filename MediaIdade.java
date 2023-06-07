package exerciciosRevisao07;

import java.util.Scanner;

public class MediaIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] idades = new int[20];
        int idade = 0;
        int contador = 0;
        for (int i = 0; i < idades.length; i++){
            System.out.println("informe sua idade ");
        int entrada = sc.nextInt();
            idade += entrada;
            contador++;
        }
        int mediaIdade = idade / contador;
        System.out.println("a média das idades é de: " + mediaIdade);
    }
}
