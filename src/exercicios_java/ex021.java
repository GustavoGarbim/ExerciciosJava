package exercicios_java;

import java.util.Scanner;

public class ex021 {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        int quantidade = scanner.nextInt();
        int menores = 0;
        int maiores = 0;



        for (i = 0; i < quantidade; i++) {
            System.out.println("Digite a idade da pessoa " + (i+1) + ":");
            int idade = scanner.nextInt();

            if(idade < 18){
                menores++;
            }
            else{
                maiores++;
            }
        }

        System.out.println("Menores de idade: " + menores);
        System.out.println("Maiores de idade: " + maiores);
    }
}
