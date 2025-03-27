package exerc3;

import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtd;

        System.out.print("Digite a quantidade de alunos: ");

        qtd = scan.nextInt();

        int[] notas = new int[qtd];
        char[] classe1 = new char[qtd];
        char[] classe2 = new char[qtd];
        char[] classe3 = new char[qtd];
        char[] classe4 = new char[qtd];

        System.out.print("Entre com a nota dos alunos separadas por espaço: ");
        for (int i = 0; i < notas.length; i++){
            notas[i] = scan.nextInt();
        }

        for (int i = 0; i < notas.length; i++){
            if (notas[i] >= 0 && notas[i] < 2){
                classe1[i] = '*';
            }
            else if (notas[i] <= 5){
                classe2[i] = '*';
            }
            else if (notas[i] <= 8) {
                classe3[i] = '*';
            }
            else {
                classe4[i] = '*';
            }
        }

        System.out.print("0 - 2 \t" + "|");
        for (char c : classe1) {
            if (c != 0){
                System.out.print(c);
            }
        }

        System.out.println("\n");
        System.out.print("3 - 5 \t" + "|");
        for (char c : classe2) {
            if (c != 0){
                System.out.print(c);
            }
        }
        System.out.println("\n");
        System.out.print("6 - 8 \t" + "|");
        for (char c : classe3) {
            if (c != 0){
                System.out.print(c);
            }
        }
        System.out.println("\n");
        System.out.print("9 - 10 \t" + "|");
        for (char c : classe4) {
            if (c != 0){
                System.out.print(c);
            }
        }


    }
}
