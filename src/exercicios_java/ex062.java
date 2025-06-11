package exercicios_java;

public class ex062 {
    public static void main(String[] args) {
        int numeroAtual = 1;

        System.out.println("Números ímpares de 1 a 50:");

        do{
            if (numeroAtual % 2 != 0) {
                System.out.println(numeroAtual);
            }
            numeroAtual++;
        }
        while (numeroAtual <= 50);
    }
}