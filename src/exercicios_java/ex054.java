package exercicios_java;

import java.util.Scanner;

public class ex054 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int contador = 1;

        do{
            System.out.print("Digite o " + contador + " número: ");
            int numeroLido = scanner.nextInt();

            soma = soma + numeroLido;
            contador++;
        }
        while (contador <= 5);
        double media = (double) soma / 5;

        System.out.println("A média dos 5 números é: " + media);
    }
}