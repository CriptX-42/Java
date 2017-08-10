
package Exerc19;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec06 {
    public static void main(String[]args){
        int x = 0, y = 0, z = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o valor de x: ");
        x = num.nextInt();
        System.out.println("Digite o valor de y: ");
        y = num.nextInt();
        
        z = x;
        x=0;
        
        x=y;
        y=0;
        y = z;
        
        System.out.println("O valor de x é: "+x+" e o de y é: "+y+ " INVERTIDOS");
    }
}
