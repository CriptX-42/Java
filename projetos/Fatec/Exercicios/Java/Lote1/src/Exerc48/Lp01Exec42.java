/*
 *  Nome do programador : Ricardo Sousa Vaz de Carvalho
 *  data da elaboracao  : 17/07/2017
 *  Objetivo: Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde: 
 *  Casa:  1 2 3 4 ... 64 
 *  Qdte: 1 2 4 8 ... N 
 */
package Exerc48;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec42 {
    public static void main (String[]args){
        int qdte = 1;
        for(int c = 0; c<64;c++){
        qdte = qdte*2;
        System.out.print(c+" = "+qdte);
         
        
        }
        System.out.println("");
    }
}
