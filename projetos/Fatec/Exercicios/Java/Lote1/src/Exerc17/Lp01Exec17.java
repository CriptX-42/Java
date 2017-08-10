/*
Nome do programador : Ricardo Sousa Vaz de Carvalho
data da elaboracao  : 06/07/2017
Objetivo: Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média. 
 */
package Exerc17;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec17 {
    public static void main(String[]args){
        int temp = 0, quantLitr = 0, veloMedia = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Digite a velocidade média: ");
        veloMedia =  num.nextInt();
        System.out.println("Digite o tempo gasto no percurso: ");
        temp =  num.nextInt();
        quantLitr=((veloMedia*temp)/12);
        System.out.println("Você vai gastar exatamente "+quantLitr+" litros de combustivel");
    }
}
