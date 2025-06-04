package exercicios_java;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner entrada_nota1 = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float nota1 = entrada_nota1.nextFloat();

        Scanner entrada_nota2 = new Scanner(System.in);
        System.out.println("Digite a segunda nota: ");
        float nota2 = entrada_nota2.nextFloat();

        Scanner entrada_nota3 = new Scanner(System.in);
        System.out.println("Digite a terceira nota: ");
        float nota3 = entrada_nota3.nextFloat();

        float media = (nota1*2 + nota2*3 + nota3*5)/10;

        System.out.println("A média ponderada das notas é: "+media);
    }
}
