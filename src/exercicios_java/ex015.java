package exercicios_java;

import java.util.Scanner;

public class ex015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário atual: ");
        double salario = scanner.nextDouble();
        double novoSalario = salario * 1.15;

        System.out.println("O novo salário com 15% de aumento é: R$ " + novoSalario);
    }
}
