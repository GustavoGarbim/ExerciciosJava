package exercicios_java;

public class ex060 {
    public static void main(String[] args) {
        long anterior = 0;
        long atual = 1;

        int cont = 1;

        System.out.println("Os primeiros 20 números da sequência de Fibonacci: ");

        do{
            System.out.print(anterior + " ");

            long proximo = anterior + atual;
            anterior = atual;
            atual = proximo;

            cont++;
        }
        while (cont <= 20);
    }
}