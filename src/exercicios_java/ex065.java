package exercicios_java;

import java.util.Scanner;

public class ex065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;
        int totalPessoas = 0;
        String nome;

        do{
            System.out.print("Digite o nome (ou 'fim' para parar): ");
            nome = scanner.next();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();

            somaIdades += idade;
            totalPessoas++;

        }
        while (true);

        if (totalPessoas > 0) {
            double media = (double) somaIdades / totalPessoas;
            System.out.println("A média de idade das " + totalPessoas + " pessoas é: " + media);
        } else {
            System.out.println("Nenhuma idade foi inserida");
        }
    }
}