/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modularizados;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class procCressProc23 {
      public static void main(String[]args){
        int w = 0, x = 0, y = 0, z = 0;
        maior4 m4 = new maior4();
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
        
        m4.w = w;
        m4.x = x;
        m4.y = y;
        m4.z = z;
        
        System.out.println(m4.mai4());
    }
}
class maior4{
    public int w = 0, x = 0, y = 0, z = 0;
    public String mai4(){
        if(z<w && z<x && z<y){
            return "A ordem é: "+z+" "+w+" "+x+" "+y+"";
        }else if(z>w && z>x && z<y){
            return "A ordem é: "+w+" "+x+" "+z+" "+y+"";
        }//                                "+z+" "+w+" "+x+" "+y+"
        else if(z>w&&z>x&&z>y){
            return "A ordem é: "+w+" "+x+" "+y+" "+z+"";
        }
        return null;
    }
}