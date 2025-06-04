package exercicios_java;

import java.util.Scanner;

public class ex033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o turno (M para matutino, V para vespertino): ");
        String turno = scanner.nextLine().toUpperCase();

        if(turno == "M"){
            System.out.println("Bom dia, " + nome);
        }
        else if(turno == "V"){
            System.out.println("Boa tarde, " + nome);
        }
        else{
            System.out.println("Turno inválido.");
        }
    }
}
