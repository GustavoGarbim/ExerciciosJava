package exercicios_java;

import java.util.Scanner;

public class ex022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bonus;

        System.out.println("Digite o salário do funcionário: ");
        float salario = scanner.nextFloat();

        bonus = salario > 2000 ? salario * 0.10 : salario * 0.05;

        System.out.println("O bônus do funcionário é: R$ " + bonus);
    }
}
