package exercicios_java;

import java.util.Scanner;

public class ex058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número limite para a sequência de Fibonacci: ");
        int limite = scanner.nextInt();

        int anterior = 0;
        int atual = 1;

        System.out.println("Sequência de Fibonacci até " + limite);

        System.out.print(anterior + " ");

        do{
            System.out.print(atual + " ");

            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        while (atual <= limite);
    }
}