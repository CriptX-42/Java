
package exer18a30;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class progExerciCresc23 {
    public static void main(String[]args){
        int w = 0, x = 0, y = 0, z = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("--=!!!DIGITE OS 3 PRIMEIROS VALORES EM ORDEM CRESCENTE, O ULTIMO EM QUALQUER ORDEM!!!=--");
        System.out.println("Digite o primeiro numero:");
        w = num.nextInt();
        System.out.println("Digite o segundo numero:");
        x = num.nextInt();
        System.out.println("Digite o terceiro numero:");
        y = num.nextInt();
        System.out.println("Digite o querto numero, em qualquer ordem:");
        z = num.nextInt();
        
        if(z<w && z<x && z<y){
            System.out.println("A ordem é: "+z+" "+w+" "+x+" "+y+"");
        }else if(z>w && z>x && z<y){
            System.out.println("A ordem é: "+w+" "+x+" "+z+" "+y+"");
        }//                                "+z+" "+w+" "+x+" "+y+"
        else if(z>w&&z>x&&z>y){
            System.out.println("A ordem é: "+w+" "+x+" "+y+" "+z+"");
        }
    }
}
