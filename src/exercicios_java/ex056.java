package exercicios_java;

import java.util.Scanner;

public class ex056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        System.out.println("Os divisores de " + numero + " são:");
        int divisor = 1;

        do {
            if (numero % divisor == 0) {
                System.out.print(divisor + " ");
            }
            divisor++;
        } while (divisor <= numero);
    }
}