package ExerciciosJavaBasico;

import java.util.Scanner;

public class ExCalculoRaio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o raio do círculo: ");
        float raio = scan.nextFloat();
        float calRaio = raio * raio;
        float area = (float) (calRaio * 3.14);
        System.out.println("O resultado do cálculo é: " + area);
    }
}
