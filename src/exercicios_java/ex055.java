package exercicios_java;

import java.util.Scanner;

public class ex055 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para ver a sua tabuada: ");
        int numero = scanner.nextInt();
        int multiplicador = 1;

        System.out.println("Tabuada do " + numero);

        do{
            int resultado = numero * multiplicador;
            System.out.println(numero + " x " + multiplicador + " = " + resultado);
            multiplicador++;
        }
        while (multiplicador <= 10);

        scanner.close();
    }
}