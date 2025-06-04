package exercicios_java;

import java.util.Arrays;
import java.util.Scanner;

public class ex024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;

        System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int numero3 = scanner.nextInt();

        int[] numeros = {numero1, numero2, numero3};

        Arrays.sort(numeros);

        System.out.println("Números em ordem crescente: ");
        for(i = 0; i < 3; i++) {
            System.out.print(numeros[i]);

            if(i < 3 - 1) {
                System.out.println(", ");
            }
        }
    }
}