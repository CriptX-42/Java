/*
Nome do programador : Ricardo Sousa Vaz de Carvalho
data da elaboracao  : 06/07/2017
Objetivo: Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possue2 raízes).  
 */
package Exerc17;

import java.util.Scanner;


public class Lp01Exec18 {
    public static void main(String[]args){
        int num1 = 0,num2 = 0, dif = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro numero:");
        num1= num.nextInt();
        System.out.println("Digite o valor do segundo numero");
        num2= num.nextInt();
        if (num1>num2){
        dif= (num1-num2);    
        System.out.println("O valor da diferença é de: "+dif);
        }else if(num1 == num2){
            System.out.println("O valor da diferença é de: 0");
        }else{
          dif= (num2-num1);    
        System.out.println("O valor da diferença é de: "+dif);  
        }
    }
    }

