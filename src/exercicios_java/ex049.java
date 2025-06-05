package exercicios_java;

import java.util.Scanner;

public class ex049 {
    public static void main(String[] args) {
        int fatorial = 1;
        int contador = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int num = scanner.nextInt();

        while(contador <= num){
            fatorial = fatorial * contador;
            contador = contador + 1;
        }
        System.out.println("o fatorial de " + num + " é: " + fatorial);
    }
}
