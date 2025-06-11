package exercicios_java;

import java.util.Scanner;

public class ex069 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + " número: ");
            int num = scanner.nextInt();
            soma += num;
        }

        double media = (double) soma / 5;
        System.out.println("A média dos números lidos é: " + media);
    }
}