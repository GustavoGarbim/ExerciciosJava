package exercicios_java;

import java.util.Scanner;

public class ex059 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;
        int contadorPessoas = 1;

        do{
            System.out.print("Digite o nome da " + contadorPessoas + " pessoa: ");
            String nome = scanner.next();

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();

            somaIdades = somaIdades + idade;
            contadorPessoas++;
        }
        while (contadorPessoas <= 5);

        double media = (double) somaIdades / 5;

        System.out.println("A média de idade das 5 pessoas é: " + media);
    }
}