/*
    Nome do programador : Ricardo Sousa Vaz de Carvalho
    data da elaboracao  : 10/07/2017
    Objetivo: Receba a hora de início e de final de um jogo (HH,MM) sabendo que o tempo máximo é de 24 horas e pode começar num dia e terminar noutro.
 */
package Exerc18;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec25 {
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);
        int hI = 0,hF = 0,mI = 0,mF = 0,tempHoras = 0, tempMinu = 0;
        
        System.out.println("Digite a hora inicial do jogo");
        hI = num.nextInt();
        System.out.println("Digite o minuto inicial do jogo");
        mI = num.nextInt();
        System.out.println("Digite a hora final do jogo");
        hF = num.nextInt();
        System.out.println("Digite a minuto final do jogo");
        mF = num.nextInt();
        
        if(hF>=hI){
            tempHoras = (hF-hI);
        }else{
            tempHoras = (hF+24-hI);
        }if(mF>=mI){
            tempMinu = mF-mI;
        }else{
            tempMinu = ((mF+59)-mI);
        }if(hI<=0&hF<=0&hI>24&hF>24&mI<=0&mF<=0&mI>59&mF>59){
            System.out.println("INVALIDO");
        }
        System.out.println("O jogo teve: "+tempHoras+" h "+tempMinu);
    
    }
    
}
