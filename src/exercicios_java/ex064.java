package exercicios_java;

import java.util.Scanner;

public class ex064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        long fatorial = 1;
        int contador = numero;

        if (numero >= 0) {
            do{
                if (contador == 0) {
                    break;
                }
                fatorial = fatorial * contador;
                contador--;
            }
            while (contador > 0);

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
        else{
            System.out.println("Não tem fatorial de número negativo");
        }
    }
}