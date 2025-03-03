package ExerciciosJavaBasico.CondicionaisLoops;

import java.util.Scanner;

public class ExPositivoNegativo {
    public static void main(String[] args) {
        //Programa que mostre se o número é positivo ou negativo.
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int valor = scan.nextInt();
        if ((valor % 2) == 0){
            System.out.println("Esse número é par.");
        } else {
            System.out.println("Esse número é ímpar.");
        }

    }
}
