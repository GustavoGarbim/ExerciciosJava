package exercicios_java;

public class ex075 {
    public static void main(String[] args) {
        System.out.println("Os primeiros 20 números da sequência de Fibonacci: ");
        long anterior = 0;
        long atual = 1;

        for (int i = 1; i <= 20; i++) {
            System.out.print(anterior + " ");

            long proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
    }
}