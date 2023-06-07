package exerciciosRevisao07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeituraSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = 0.0;
        List<Double> valores = new ArrayList<>();
        double reajuste = 0.0;
        while (salario != -1){
            System.out.println("escreva o valor do salário: -1 para terminar.");
            salario = sc.nextDouble();
valores.add(salario);
        }
        System.out.println("agora, escreva o valor do reajuste: ");
reajuste = sc.nextDouble();


for (double valor: valores){
valor += reajuste;
int lastElement = valores.size() - 1;
valores.remove(lastElement);
    System.out.println("o valor total dos salários com reajuste é: " + valor);
        }

sc.close();
    }

}
