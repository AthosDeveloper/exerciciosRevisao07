package exerciciosRevisao07;

import java.util.Scanner;

public class Some5Ou8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int par = 5;
        int impar = 8;
    System.out.println("informe o número: ");
        int entrada = sc.nextInt();
        if ((entrada % 2)== 0){
       entrada += par;
        } else {
            entrada += impar;
        }
        System.out.println("o resultado final é: " + entrada);
    }
}
