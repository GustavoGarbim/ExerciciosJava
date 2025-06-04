package exercicios_java;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner entrada_altura = new Scanner(System.in);
        System.out.println("Digite a altura do seu triangulo: ");
        float altura = entrada_altura.nextFloat();

        Scanner entrada_base = new Scanner(System.in);
        System.out.println("Digite a base do seu triangulo: ");
        float base = entrada_base.nextFloat();

        float calculo = (altura*base)/2;

        System.out.println("Sua Área é: "+calculo);
    }
}
