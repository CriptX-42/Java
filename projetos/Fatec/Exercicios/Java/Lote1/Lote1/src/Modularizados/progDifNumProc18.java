/*
 Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.
 */
package Modularizados;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class progDifNumProc18 {
     public static void main(String[]args){
        int num1 = 0,num2 = 0;
        DifNum df = new DifNum();
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro numero:");
        num1= num.nextInt();
        System.out.println("Digite o valor do segundo numero");
        num2= num.nextInt();
        
        df.num1 = num1;
        df.num2 = num2;
        
        System.out.println("O valor da diferença é de: "+df.Diferenca());
    }
}
class DifNum{
    public int num1 = 0,num2 = 0, dif = 0;
   public int Diferenca(){
       if (num1>num2){
        dif= (num1-num2);    
        }else if (num1 == num2){
        dif= (num1-num2);
        }else{
          dif= (num2-num1);     
        }
       return dif;
   }
}
