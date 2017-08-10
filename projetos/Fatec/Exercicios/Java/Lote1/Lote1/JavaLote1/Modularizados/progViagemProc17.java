/*
 Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média. 
 */
package Modularizados;

import java.util.Scanner;

/**
 * @author Ricardo Sousa
 */
public class progViagemProc17 {
     public static void main(String[]args){
        int temp = 0, veloMedia = 0;
        
        Scanner num = new Scanner(System.in);
        calcViagem cv = new calcViagem();
        
        System.out.println("Digite a velocidade média: ");
        veloMedia =  num.nextInt();
        System.out.println("Digite o tempo gasto no percurso: ");
        temp =  num.nextInt();
        
        cv.veloMedia = veloMedia;
        cv.temp = temp;
        
        System.out.println("Você vai gastar exatamente "+cv.Litr()+" litros de combustivel");
    }
}
class calcViagem{
    public int temp = 0, quantLitr = 0, veloMedia = 0;
    public int Litr(){
        return quantLitr=((veloMedia*temp)/12);
    }
}