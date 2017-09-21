
package recursividade;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Rc01Exerc02 {
    public static void main(String []args){
        int num = 0, result = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero entre 3 e 10");
        num = ler.nextInt();
        System.out.println("O resultado é"+Fdif(result));
        
    }
    public static int Fdif(int num){
        int result1 = 0, result2 = 0;
        
        result1 = (num + (num-2)+(num-2)+(num-1));
        return result1;
    }
}
