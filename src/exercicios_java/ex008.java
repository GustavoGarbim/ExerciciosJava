package exercicios_java;

import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        Scanner entrada_num1 = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = entrada_num1.nextInt();

        Scanner entrada_num2 = new Scanner(System.in);
        System.out.println("Digite o segundo numero: ");
        int num2 = entrada_num2.nextInt();

        System.out.println("Antes da troca: ");
        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);

        int num3 = num2;

        System.out.println("Depois da troca: ");
        System.out.println("Número 1: " + num3);
        System.out.println("Número 2: " + num1);


    }
}