package exerciciosRevisao07;

import java.util.Scanner;

public class Numeros0E100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int incrementa = 0;
        for (int i = 0; i< 20; i ++){
            System.out.println("digite um número: ");
            int entrada = sc.nextInt();
            if (entrada >= 0 && entrada <= 100){
                incrementa++;
            }
        }
        System.out.println(incrementa + "Números estão entre 0 e 100.");
    }
}
