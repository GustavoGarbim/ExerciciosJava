package exercicios_java;

import java.util.Scanner;

public class ex074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o nome da " + i + "ª pessoa: ");
            String nome = scanner.next();

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            somaIdades += idade;
        }

        double media = (double) somaIdades / 5;
        System.out.println("A média de idade das 5 pessoas é: " + media);
    }
}