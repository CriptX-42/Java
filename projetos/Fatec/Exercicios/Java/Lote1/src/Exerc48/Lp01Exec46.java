/*
 *  Nome do programador : Ricardo Sousa Vaz de Carvalho
 *  data da elaboracao  : 17/07/2017
 *  Objetivo: Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano. 
 *  47
 */
package Exerc48;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec46 {
    public static void main (String[]args){
        double iMaria = 1.5, iAna=1.10,anos=0;
        while(iMaria>=iAna){
            iMaria=iMaria+3;
            iAna=iAna+2;
            anos++;
            System.out.println(anos);
        }
        
    }
}
