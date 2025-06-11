package exercicios_java;

import java.util.Scanner;

public class ex078 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        String textoNumero = Integer.toString(numero);

        System.out.println("Dígitos separados:");

        for (int i = 0; i < textoNumero.length(); i++) {
            System.out.println(textoNumero.charAt(i));
        }
    }
}