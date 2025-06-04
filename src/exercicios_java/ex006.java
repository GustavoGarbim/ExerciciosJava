package exercicios_java;

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner entrada_num = new Scanner(System.in);
        System.out.println("Digite o número que você deseja verificar");
        int num = entrada_num.nextInt();

        if(num % 2 == 0){
            System.out.println("O número é par");
        }
        else{
            System.out.println("O número é impar");
        }
    }
}
