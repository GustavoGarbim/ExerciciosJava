package exercicios_java;

import java.util.Scanner;

public class ex048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int num = scanner.nextInt();

        int copia_num = num;
        int invertido = 0;

        while(copia_num > 0){
            int resto = copia_num % 10;
            invertido = invertido * 10 + resto;

            int contador = 0;
            while(copia_num >= 10){
                copia_num = copia_num - 10;
                contador = contador + 1;
            }
            copia_num = contador;
        }

        // Mostra os dígitos separados
        while(invertido > 0){
            int digito = invertido % 10;
            System.out.println(digito);

            int contador = 0;
            while(invertido >= 10){
                invertido = invertido - 10;
                contador = contador + 1;
            }
            invertido = contador;
        }

        if(num == 0){
            System.out.println(0);
        }
    }
}
