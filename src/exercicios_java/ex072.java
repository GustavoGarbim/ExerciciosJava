package exercicios_java;

import java.util.Scanner;

public class ex072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se é primo: ");
        int numero = scanner.nextInt();
        int contadorDivisores = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contadorDivisores++;
            }
        }

        if (contadorDivisores == 2) {
            System.out.println(numero + " é um número primo");
        } else {
            System.out.println(numero + " não é um número primo");
        }
    }
}