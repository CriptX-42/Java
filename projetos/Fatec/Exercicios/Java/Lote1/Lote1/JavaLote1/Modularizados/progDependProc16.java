
package Modularizados;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */

public class progDependProc16 {
    public static void main(String[]args){
        calc Calcular = new calc();
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
        
        Calcular.valorH = valorH;
        Calcular.horasTrab = horasTrab;
        Calcular.depend = depend;
        Calcular.descont = descont;
        
        System.out.println("Você tem o salário liquido de R$:" +Calcular.descS());
    }
}
class calc{
    public int salLiq = 0, salBrut = 0, depend= 0, horasTrab = 0,valorH = 0, descont =0;;
    public int descS(){
        salBrut= (horasTrab*valorH);
        return salLiq = (salBrut-(salBrut/100)*descont+(100*depend));
    }
}