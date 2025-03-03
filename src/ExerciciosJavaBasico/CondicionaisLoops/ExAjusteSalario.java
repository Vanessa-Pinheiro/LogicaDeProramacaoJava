package ExerciciosJavaBasico.CondicionaisLoops;

import java.util.Scanner;

public class ExAjusteSalario {
    public static void main(String[] args) {
        // Faça um sistema que calcule o reajuste de salario.
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe seu salário: ");
        float salario = scan.nextFloat();

        if (salario <= 280){
            System.out.println("Seu salário atual é de R$" + salario);
            System.out.println("Seu percentual de ajuste é de 20%.");
            salario = salario * (1 + (float) 20 /100);
            System.out.println("Seu novo salário é de R$" + salario);

        } else if (salario > 280 && salario < 700) {
            System.out.println("Seu salário atual é de R$" + salario);
            System.out.println("Seu percentual de ajuste é de 15%.");
            salario = salario * (1 +(float) 15 /100);
            System.out.println("Seu novo salário é de R$" + salario);

        } else if (salario > 700 && salario < 1500) {
            System.out.println("Seu salário atual é de R$" + salario);
            System.out.println("Seu percentual de ajuste é de 10%.");
            salario = salario * (1 +(float) 10 /100);
            System.out.println("Seu novo salário é de R$" + salario);

        } else {
            System.out.println("Seu salário atual é de R$" + salario);
            System.out.println("Seu percentual de ajuste é de 5%.");
            salario = salario * (1 +(float) 5 /100);
            System.out.println("Seu novo salário é de R$" + salario);

        }
    }
}
