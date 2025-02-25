package ExerciciosJavaBasico;

import java.util.Scanner;

public class ExMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite suas notas para obter sua média semestral: ");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double nota3 = scan.nextDouble();
        double nota4 = scan.nextDouble();
        double cauculo = nota1 + nota2 + nota3 + nota4;
        double media = cauculo/4;
        System.out.println(" Sua média é de: " + media);
        if (media > 7){
            System.out.println("Parabéns, você foi aprovado!");
        } else {
            System.out.println("Abra chamado com o seu polo para obter mais informações.");
        }
    }
}
