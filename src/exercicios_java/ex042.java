package exercicios_java;

import java.util.Scanner;

public class ex042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        int i = 2;
        boolean verf_primo = true;

        if(num <= 1){
            verf_primo = false;
        }
        else{
            while(i < num){
                if (num % i == 0) {
                    verf_primo = false;
                    break;
                }
                i++;
            }
        }

        if(verf_primo){
            System.out.println(num + " é número primo");
        }
        else{
            System.out.println(num + " não é número primo");
        }
    }
}
