package ExerciciosJavaBasico;

import java.util.Scanner;

public class ExCalculoSalario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o valor da sua hora trabalhada: ");
        float valor = scan.nextFloat();
        System.out.println("Informe quantas horas você trabalha por dia em média: ");
        int horas = scan.nextInt();
        int semana = (int) (valor * horas);
        float salario = semana * 20;
        System.out.println("Seu salário é de: R$" + salario);

    }
}
