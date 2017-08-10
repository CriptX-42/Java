
package Exerc19;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class progDescSal16 {
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
