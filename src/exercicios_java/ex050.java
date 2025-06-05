package exercicios_java;

import java.util.Scanner;

public class ex050 {
    public static void main(String[] args) {
        String nome = "";
        int idade = 0;
        int somaIdades = 0;
        double quantidadePessoas = 0;
        double media = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome (ou 'fim' pra parar): ");
        nome = scanner.nextLine();

        while(nome != "fim"){
            System.out.println("Digite a idade: ");
            idade = scanner.nextInt();

            somaIdades = somaIdades + idade;
            quantidadePessoas = quantidadePessoas + 1;

            System.out.print("Digite o próximo nome (ou 'fim' pra parar): ");
            nome = scanner.nextLine();
        }

        if(quantidadePessoas > 0){
            media = somaIdades / quantidadePessoas;
            System.out.println("A média das idades é: " + media);
        }
    }
}
