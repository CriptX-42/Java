/*
Nome do programador : Ricardo Sousa Vaz de Carvalho
data da elaboracao  : 06/07/2017
Objetivo: Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
 */
package Exerc17;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec16 {
    public static void main(String[]args){
        int salLiq = 0, salBrut = 0, depend= 0, horasTrab = 0,valorH = 0, descont =0;
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o valor da hora trabalhada: ");
        valorH = num.nextInt();
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horasTrab = num.nextInt();
        System.out.println("Digite o total de dependentes: ");
        depend = num.nextInt();
        System.out.println("Digite o desconto: ");
        descont = num.nextInt();
        salBrut= (horasTrab*valorH);
        salLiq = (salBrut-(salBrut/100)*descont+(100*depend));
        System.out.println("Você tem o salário liquido de R$:"+salLiq);
    }
}
