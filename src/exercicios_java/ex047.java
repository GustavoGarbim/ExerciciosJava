package exercicios_java;

public class ex047 {
    public static void main(String[] args) {
        int numAtual = 1;
        System.out.println("Números ímpares de 1 a 50:");

        while (numAtual <= 50) {
            if (numAtual % 2 != 0) {
                System.out.println(numAtual);
            }
            numAtual++;
        }
    }
}