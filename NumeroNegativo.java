package exerciciosRevisao07;

import java.util.Scanner;

public class NumeroNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 7; i ++){
            System.out.println("digite um número: ");
            int entrada = sc.nextInt();
            if (entrada < 0){
                System.out.println("números negativos não são permitidos");
            }
            int numero = entrada;
            System.out.println(numero);
        }
    }
}
