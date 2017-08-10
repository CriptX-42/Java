
package Exerc19;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class progViagem17 {
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
