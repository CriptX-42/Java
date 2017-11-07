
package recursividade;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Rc01Exerc01 {
    public static void main(String []args){
        int num =0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Soma é: "+Fsoma(num));
        
        
    }
    //RECURSIVO
    //RECURSIVO
    //RECURSIVO
    public static int Fsoma(int num){
        int soma =0;
        if(num == 100){
            return num;
            
        }else{
           soma = num + Fsoma(num+1);
        return soma;
        }
        
    }
    
}
