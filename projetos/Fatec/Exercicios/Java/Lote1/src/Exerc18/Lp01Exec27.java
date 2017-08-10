/*
    Nome do programador : Ricardo Sousa Vaz de Carvalho
    data da elaboracao  : 10/07/2017
    Objetivo: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h. 
 */
package Exerc18;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec27 {
    public static void main(String[]args){
        double volt = 0, metro = 0, tempDura = 0, veloMedia = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o numero de voltas: ");
        volt = num.nextInt();
        System.out.println("Digite a Extensão do circuito(Em metros): ");
        metro = num.nextInt();
        System.out.println("Tempo de duração em minutos: ");
        tempDura = num.nextInt();
        veloMedia= (((volt*metro)/tempDura*60)*3.6);
        System.out.println("A velocidade media é de: "+veloMedia);
    }
}
