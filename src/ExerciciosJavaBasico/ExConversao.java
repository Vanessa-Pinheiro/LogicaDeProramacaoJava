package ExerciciosJavaBasico;

import java.util.Scanner;

public class ExConversao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantos metros possui o objeto: ");
        double metros = scan.nextDouble();
        double conversao = metros * 100;
        System.out.println("O objeto possui " + conversao + " cm.");
    }
}
