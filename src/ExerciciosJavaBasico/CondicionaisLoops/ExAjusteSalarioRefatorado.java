package ExerciciosJavaBasico.CondicionaisLoops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExAjusteSalarioRefatorado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu salário atual: R$");
        double salarioAtual = scan.nextDouble();

        double percentualAumento = 0;
        double aumento = 0;
        double novoSalario = 0;

        if (salarioAtual <= 280){
            percentualAumento = 20;
        } else if (salarioAtual <= 700) {
            percentualAumento = 15;
        } else if (salarioAtual <= 1500) {
            percentualAumento = 10;
        } else {
            percentualAumento = 5;
        }

        aumento = salarioAtual * percentualAumento /100;
        novoSalario = aumento;

        System.out.println("-----DETALHES DO REAJUSTE----");
        System.out.println("Salário antes do reajuste: R$" + salarioAtual);
        System.out.println("Percentual do aumento: " + percentualAumento + "%");
        System.out.println("Valor do aumento: R$" + aumento);
        System.out.println("Valor do novo salário: R$" + novoSalario);

    }
}
