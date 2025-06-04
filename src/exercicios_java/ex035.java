package exercicios_java;

import java.util.Scanner;

public class ex035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        double media = (numero1 + numero2 + numero3) / 3.0;
        String resultado;

        if(media >= 7){
            resultado = "Aprovado";
        }
        else{
            resultado = "Reprovado";
        }

        System.out.println("Média: " + media);
        System.out.println("Situação: " + resultado);
    }
}
