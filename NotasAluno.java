package exerciciosRevisao07;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NotasAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat();
        System.out.println("informe o número de identificação: ");
int id = sc.nextInt();

        System.out.println("agora, informe a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("agora, informe a segunda nota: ");
double nota2 = sc.nextDouble();
        System.out.println("agora, informe a terceira nota: ");
double nota3 = sc.nextDouble();
double me = (nota1 + nota2 + nota3) / 3;
        double ma = (nota1 + nota2 * 2 + nota3 * 3 + me)/7;

        if (ma >= 90){

            System.out.println("número do aluno: " + id + "notas: " + nota1 + nota2 + nota3 + " média dos exercícios: " + me + " aproveitamento: " + ma + " conceito a: Você foi aprovado!");
        } else if (ma >= 75 && ma < 90){

            System.out.println("número do aluno: " + id + "notas: " + nota1 + nota2 + nota3 + " média dos exercícios: " + me + " aproveitamento: " + ma + " conceito b: Você foi aprovado!");

        } else if (ma >= 60 && ma < 75){

            System.out.println("número do aluno: " + id + "notas: " + nota1 + nota2 + nota3 + " média dos exercícios: " + me + " aproveitamento: " + ma + " conceito c: Você foi aprovado!");

        } else if (ma >= 40 && ma < 60){

            System.out.println("número do aluno: " + id + "notas: " + nota1 + nota2 + nota3 + " média dos exercícios: " + me + " aproveitamento: " + ma + " conceito d: Você foi reprovado.");

        } else{

            System.out.println("número do aluno: " + id + "notas: " + nota1 + nota2 + nota3 + " média dos exercícios: " + d.format(me) + " aproveitamento: " + d.format(ma) + " conceito e: Você foi reprovado.");

        }
sc.close();

    }
}
