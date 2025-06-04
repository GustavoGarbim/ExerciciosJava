package exercicios_java;

import java.util.Scanner;

public class ex030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de maçãs compradas: ");
        int quantidade = scanner.nextInt();

        double preco;

        if(quantidade >= 12){
            preco = 0.40;
        }
        else{
            preco = 0.50;
        }
        double total = quantidade * preco;

        System.out.println("Valor total a ser pago: R$" + total);
    }
}
