package exerciciosRevisao07;

import java.util.Scanner;

public class SomaIguais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        System.out.println("digite o primeiro valor:");
       int a = sc.nextInt();
        System.out.println("agora, insira o segundo valor: ");
        int b = sc.nextInt();
        if (a == b){
            c = a + b;
        } else {
            c = a * b;
        }
        System.out.println("o resultado final é: " + c);
        sc.close();
    }
}
