package exerciciosRevisao07;

import java.util.Scanner;

public class NomeVezes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        System.out.println("escreva quantas vezes seu nome será imprimido na tela: ");

        int quantidade = sc.nextInt();
        int [] vezes = new int[quantidade - 1];
        System.out.println("agora, escreva seu nome: ");
        nome = sc.next();
        for (int i = 0; i < vezes.length; i ++){
            System.out.println(nome);
        }
        sc.close();
    }
}
