package exercicios_java;

import java.util.Scanner;

public class ex076 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numeroLimite = scanner.nextInt();

        int somaDosPares = 0;
        for (int i = 1; i <= numeroLimite; i++) {
            if (i % 2 == 0) {
                somaDosPares += i;
            }
        }

        System.out.println("a soma dos pares de 1 até " + numeroLimite + " é: " + somaDosPares);
    }
}