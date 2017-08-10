
package exer18a30;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class progRestMultipl26 {
    public static void main(String[]args){
        int x = 0,y = 0,resto = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        x = num.nextInt();
        System.out.println("Digite o segundo numero: ");
        y = num.nextInt();
        if (x<y){
        resto=(y%x);
        if(resto == 0){
            
            System.out.println("é divisível ");
        }else{
           System.out.println(" não é divisível "); 
        }
        }
        if (x>y){
        resto=(x%y);
            if(resto == 0){
            
            System.out.println("é divisível ");
        }else{
           System.out.println(" não é divisível "); 
        }
        }
    }
}
