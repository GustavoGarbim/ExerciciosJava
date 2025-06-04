package exercicios_java;

import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura em metros (ex: 1,70): ");
        double altura = scanner.nextDouble();

        double imc = peso/(altura*altura);

        System.out.println("seu IMC é: "+imc);
    }
}
