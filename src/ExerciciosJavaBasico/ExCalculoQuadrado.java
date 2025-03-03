package ExerciciosJavaBasico;

import java.util.Scanner;

public class ExCalculoQuadrado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a medida de um dos lados do triangulo: ");
        int lado = scan.nextInt();
        int area = lado * lado;
        int resultado = area * 2;
        System.out.println("A área do quadrado é de: " + area);
        System.out.println("O dobro da área desse quadrado é: " + resultado);
    }
}
