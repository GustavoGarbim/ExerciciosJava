package exercicios_java;

import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade em anos: ");
        int anos = scanner.nextInt();

        System.out.println("Digite sua idade em anos: ");
        int meses = scanner.nextInt();

        System.out.println("Digite sua idade em anos: ");
        int dias = scanner.nextInt();

        int totalDia = (anos * 365) + (meses * 30) + dias;

        System.out.println("Você tem aproximadamente " + totalDia + " dias de vida.");
    }
}
