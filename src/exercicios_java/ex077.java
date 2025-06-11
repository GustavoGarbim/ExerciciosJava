package exercicios_java;

public class ex077 {
    public static void main(String[] args) {
        System.out.println("Números impares de 50 a 1: ");

        for (int i = 50; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}