package exercicios_java;

public class ex052 {
    public static void main(String[] args) {
        int contador = 1;
        int soma = 0;

        do {
            soma = soma + contador;
            contador++;
        }
        while (contador <= 100);
        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}