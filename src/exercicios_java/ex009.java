package exercicios_java;

import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {
        int mes;
        float montante = 0;

        Scanner entrada_deposito = new Scanner(System.in);
        System.out.println("Digite seu deposito: ");
        float deposito = entrada_deposito.nextFloat();

        Scanner entrada_juros = new Scanner(System.in);
        System.out.println("Digite a % juros (sem o %, apenas o número): ");
        float juros = entrada_juros.nextFloat();

        float juroscalculado = juros/100;

        for (mes = 1; mes <= 12; mes++) {
           montante = (montante + deposito) * (1 + juroscalculado);
        }
        System.out.println("Montante após 12 meses: "+montante);
    }
}
