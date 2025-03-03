package ExerciciosJavaBasico.CondicionaisLoops;

import java.util.Scanner;

public class ExQualMaior {
    public static void main(String[] args) {
        //Programa que pede dois números e imprime o maior.
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor para a: ");
        int numA = scan.nextInt();
        System.out.println("Digite um valor para b: ");
        int numB = scan.nextInt();

        if (numA > numB){
            System.out.println("O valor de a é maior.");
        } else {
            System.out.println("O valor de b é maior.");
        }
        
    }
}
