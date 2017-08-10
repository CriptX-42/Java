
package exer18a30;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class progNota21 {
    public static void main(String[]args){
        double nota1 = 0,nota2 = 0,nota3 = 0,nota4 = 0, aprov = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        nota1 = num.nextDouble();
        System.out.println("Digite a segunda nota");
        nota2 = num.nextDouble();
        System.out.println("Digite a terceira nota");
        nota3 = num.nextDouble();
        System.out.println("Digite a quarta nota");
        nota4 = num.nextDouble();
        
        aprov = ((nota1+nota2+nota3+nota4)/4);
        if(aprov>=6){
           System.out.println("Parabéns você foi aprovado, sua nota é: "+aprov); 
        }else if(aprov>=3 & aprov <6){
           System.out.println("Você está de exame, sua nota é: "+aprov); 
        }else if (aprov < 3){
           System.out.println("Você ficou retido, sua nota é: "+aprov); 
        }
    }
}
