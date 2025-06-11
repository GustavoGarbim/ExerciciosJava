package exercicios_java;

import java.util.Scanner;

public class ex043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para a sequência de Fibonacci: ");
        int limite = scanner.nextInt();

        int numAnterior = 0;
        int numAtual = 1;

        System.out.println("Sequência de Fibonacci até " + limite + ": ");

        while (numAnterior <= limite) {
            System.out.print(numAnterior + " ");

            int proximoNum = numAnterior + numAtual;
            numAnterior = numAtual;
            numAtual = proximoNum;
        }
    }
}