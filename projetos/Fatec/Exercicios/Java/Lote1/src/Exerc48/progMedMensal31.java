
package Exerc48;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class progMedMensal31 {
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);
        double precAtual = 0, medMensal=0, novoPrec = 0;
        System.out.println("Digite o preço atual do produto:");
        precAtual = num.nextInt();
        System.out.println("Digite a media mensal do produto:");
        medMensal = num.nextInt();
        
        if(medMensal < 500 && precAtual <30){
            novoPrec = (precAtual*0.10);
            novoPrec += precAtual;
            System.out.println("O novo valor é de: "+novoPrec);
        }else if(medMensal >= 500 && medMensal <1000 && precAtual >=30 && precAtual <80){
            novoPrec = (precAtual*0.15);
            novoPrec += precAtual;
            System.out.println("O novo valor é de: "+novoPrec);
        }else if(medMensal >= 1000 && precAtual >=80){
            novoPrec = (precAtual*0.05);
            precAtual -= novoPrec ;
            System.out.println("O novo valor é de: "+precAtual);
        }else{
         System.out.println("Não houve alteração no preço do produto: "+precAtual);   
        }
    }
}
