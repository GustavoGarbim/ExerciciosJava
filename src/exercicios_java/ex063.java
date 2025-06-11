package exercicios_java;

import java.util.Scanner;

public class ex063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        String numeroTexto = Integer.toString(numero); // transformar em texto pra separar

        System.out.println("Os dígitos separados são:");

        int i = 0;
        do {
            char digito = numeroTexto.charAt(i);
            System.out.println(digito);
            i++;
        } while (i < numeroTexto.length());
    }
}