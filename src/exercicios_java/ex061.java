package exercicios_java;

import java.util.Scanner;

public class ex061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroLimite = scanner.nextInt();

        int somaPares = 0;
        int numeroAtual = 1;

        do{
            if (numeroAtual % 2 == 0) {
                somaPares = somaPares + numeroAtual;
            }
            numeroAtual++;
        }
        while (numeroAtual <= numeroLimite);

        System.out.println("A soma de todos os números pares de 1 até " + numeroLimite + " é: " + somaPares);
    }
}