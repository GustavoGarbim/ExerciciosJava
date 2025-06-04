package exercicios_java;

import java.util.Scanner;

public class ex019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota1 = scanner.nextInt();
        int nota2 = scanner.nextInt();
        int nota3 = scanner.nextInt();

        int media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Aprovado com média " + media);
        } else {
            System.out.println("Reprovado com média " + media);
        }
    }
}
