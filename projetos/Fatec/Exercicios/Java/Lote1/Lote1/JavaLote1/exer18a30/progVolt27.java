
package exer18a30;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class progVolt27 {
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
