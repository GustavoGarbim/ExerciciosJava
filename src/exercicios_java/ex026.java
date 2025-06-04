package exercicios_java;

import java.util.Scanner;

public class ex026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double preco1 = 10.0;
        double preco2 = 15.0;
        double preco3 = 20.0;
        double preco4 = 25.0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código do produto (1-4): ");
        int codigo = sc.nextInt();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = sc.nextInt();

        double preco;

        if(codigo == 1){
            preco = preco1;
        }
        else if(codigo == 2){
            preco = preco2;
        }
        else if(codigo == 3){
            preco = preco3;
        }
        else if(codigo == 4){
            preco = preco4;
        }
        else{
            System.out.println("Código de produto inválido.");
            sc.close();
            return;
        }
        double total = preco * quantidade;
        System.out.println("Valor total a ser pago: R$ %.2f%n" + total);
    }
}
