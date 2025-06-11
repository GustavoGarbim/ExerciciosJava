package exercicios_java;

public class ex045 {
    public static void main(String[] args) {
        long numAnterior = 0;
        long numAtual = 1;

        int cont = 1;

        System.out.println("Os primeiros 20 números da sequência de Fibonacci: ");

        while (cont <= 20) {
            System.out.print(numAnterior + " ");

            long proximoNum = numAnterior + numAtual;
            numAnterior = numAtual;
            numAtual = proximoNum;

            cont++;
        }
    }
}