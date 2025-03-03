package ExerciciosJavaBasico.CondicionaisLoops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExCalculoFolhaPgmt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o valor da sua hora trabalhada: R$");
        double valorHora = scan.nextDouble();
        System.out.println("Quantas horas foram trabalhadas no mês: ");
        double qntdHoras = scan.nextDouble();
        double salBruto = valorHora * qntdHoras;
        // Variáveis
        double descInss;
        double valorFgts;
        double desIR;
        double porcentagemDesc = 0;
        double salLiquido;
        double totalDescontos = 0;


        // Calculo INSS
        descInss = salBruto * 10/100;

        //Valor FGTS
        valorFgts = salBruto * 11/100;



        if (salBruto <= 900){
            valorFgts = salBruto * 11/100;
            
        } else if (salBruto < 1500) {
            porcentagemDesc = 5;
            descInss = salBruto * 10/100;
            valorFgts = salBruto * 11/100;
            
        } else if (salBruto < 2500) {
            porcentagemDesc = 10;
            descInss = salBruto * 10/100;
            valorFgts = salBruto * 11/100;
            
        } else {
            porcentagemDesc = 20;
            descInss = salBruto * 10/100;
            valorFgts = salBruto * 11/100;

        }
        // Calculo IR
        desIR = salBruto * porcentagemDesc / 100;

        //Total de descontos
        totalDescontos = desIR + descInss;

        //Salário líquido
        salLiquido = salBruto - totalDescontos;

        System.out.println("-----FOLHA DE PAGAMENTO-----");
        System.out.println("Salário bruto: R$" + salBruto);
        System.out.println("Desconto IR: R$" + desIR);
        System.out.println("Desconto INSS: R$" + descInss);
        System.out.println("Valor FGTS: R$" + valorFgts);
        System.out.println("Total de Descontos: R$" + totalDescontos);
        System.out.println("Saalário líquido: R$" + salLiquido);


    }
}
