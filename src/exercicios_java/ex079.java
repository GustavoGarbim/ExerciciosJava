package exercicios_java;

import java.util.Scanner;

public class ex079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        long fatorial = 1;

        if (numero >= 0) {
            for (int i = numero; i >= 1; i--) {
                fatorial = fatorial * i;
            }
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        } else {
            System.out.println("Não existe fatorial para número negativo");
        }
    }
}