package exercicios_java;

import java.util.Scanner;

public class ex057 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se é primo: ");
        int numero = scanner.nextInt();

        int contadorDivisores = 0;
        int divisor = 1;

        do{
            if (numero % divisor == 0) {
                contadorDivisores++;
            }
            divisor++;
        }
        while (divisor <= numero);

        if (contadorDivisores == 2){
            System.out.println(numero + " é um número primo");
        }
        else {
            System.out.println(numero + " não é um número primo");
        }
    }
}