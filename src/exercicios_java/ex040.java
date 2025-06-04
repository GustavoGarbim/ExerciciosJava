package exercicios_java;

import java.util.Scanner;

public class ex040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();
        int i = 0;
        int resultado;

        while(i<10){
            i++;
            resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
    }
}
