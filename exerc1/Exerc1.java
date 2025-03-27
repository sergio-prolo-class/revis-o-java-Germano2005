package exerc1;

import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int anoNasc;
        int anoAtual;

        System.out.print("Entre com seu nome: ");
        nome = scanner.next();

        System.out.print("Entre com o ano que você nasceu: ");
        anoNasc = scanner.nextInt();

        System.out.print("Entre com o ano atual: ");
        anoAtual = scanner.nextInt();

        int idade = anoAtual - anoNasc;

        System.out.println(nome + ", possui " + idade + " anos");
    }
}