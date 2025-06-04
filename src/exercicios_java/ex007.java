package exercicios_java;

import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner entrada_sal_base = new Scanner(System.in);
        System.out.println("Digite seu salário base");
        float sal_base = entrada_sal_base.nextFloat();

        double comissao = sal_base+(sal_base*0.05);
        double inss = comissao-(comissao*0.10);
        double fgts = inss - (inss*0.08);

        System.out.println("Seu salário liquido é: "+fgts);
    }
}
