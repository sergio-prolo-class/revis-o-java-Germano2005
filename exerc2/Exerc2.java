package exerc2;

import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double cf, nota1, nota2, soma;
        int participacao;

        System.out.print("Digite o valor da nota 1: ");
        nota1 = scan.nextDouble();

        System.out.print("Digite o valor da nota 2: ");
        nota2 = scan.nextDouble();

        System.out.print("Digite o valor da nota de participação: ");
        participacao = scan.nextInt();

        cf = (((nota1 * 2) + (nota2 * 3)) / 5) * (0.9 + participacao * 0.1);

        if (cf >= 6){
            System.out.println("APROVADO!");
        }
        else {
            System.out.println("REPROVADO!");
        }


    }
}
