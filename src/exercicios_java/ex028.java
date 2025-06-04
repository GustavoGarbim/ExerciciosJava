package exercicios_java;

import java.util.Scanner;

public class ex028 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura (ex: 1,70): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        String classificacao;

        if(imc < 18.5){
            classificacao = "Abaixo do peso";
        }
        else if(imc < 24.9){
            classificacao = "Peso normal";
        }
        else if(imc < 29.9){
            classificacao = "Sobrepeso";
        }
        else if(imc < 34.9){
            classificacao = "Obesidade grau 1";
        }
        else if(imc < 39.9){
            classificacao = "Obesidade grau 2";
        }
        else{
            classificacao = "Obesidade grau 3";
        }
        System.out.println("Seu IMC é " + imc + " e você é " + classificacao);

    }
}
