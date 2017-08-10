
package exer18a30;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class progDivisivel24 {
    public static void main(String[]args){
        double num2 = 0, num3 = 0, x = 0;
        Scanner num = new Scanner (System.in);
        System.out.println("Digite o numero a ser dividido: ");
        x = num.nextDouble();
        num2 = (x%2);
        num3 = (x%3);
        if (num2 == 0 && num3 == 0 ){
            System.out.println("O numero é divisivel por 2 e por 3");
        }else if(num2 == 0){
            System.out.println("O numero é divisivel por 2");
        
        }else if(num3 == 0){
            System.out.println("O numero é divisivel por 3");
        }else{
            System.out.println("O numero não é divisivel");
        }
    }
}
