package exercicios_java;

import java.util.Scanner;

public class ex034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        String msg;

        if(idade >= 18 && idade <= 70){
            msg = "O voto é obrigatório";
        }
        else if((idade >= 16 && idade < 18) || idade > 70){ // (|| = ou)
            msg = "O voto é facultativo";
        }
        else{
            msg = "Você não pode votar";
        }
        System.out.println(msg);
    }
}
