package exercicios_java;

import java.util.Scanner;

public class ex073 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número limite para a sequência de Fibonacci: ");
        int limite = scanner.nextInt();

        System.out.println("Sequência de Fibonacci até " + limite + ":");

        for (int anterior = 0, atual = 1; anterior <= limite; ) {
            System.out.print(anterior + " ");

            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
    }
}