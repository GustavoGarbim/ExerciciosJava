package exercicios_java;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner entrada_precoProduto = new Scanner(System.in);
        System.out.println("Digite o preço do produto: ");
        float precoProdutos = entrada_precoProduto.nextInt();

        Scanner entrada_qntProduto = new Scanner(System.in);
        System.out.println("Digite a quantidade do produto: ");
        int qntProduto = entrada_qntProduto.nextInt();

        float precoTotal = precoProdutos*qntProduto;

        if(qntProduto>=10){
            double subTotal = precoTotal - (precoTotal*0.10);
            System.out.println("Preço total: "+subTotal);
        }
        else{
            System.out.println("Preço total: "+precoTotal);
        }
    }
}
