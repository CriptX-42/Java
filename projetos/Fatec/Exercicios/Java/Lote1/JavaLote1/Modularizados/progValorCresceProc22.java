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
public class progValorCresceProc22 {
    public static void main(String[]args){
        int x = 0, y = 0;
        vCress vc = new vCress();
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        x = num.nextInt();
        System.out.println("Digite o segundo numero");
        y = num.nextInt();
        
        vc.x = x;
        vc.y = y;
        
        System.out.println(vc.Maior());
        
    }
}
class vCress{
    public int x = 0, y = 0;
    public String Maior(){
        if(x>y){
            return " "+x+" "+y+"";
        }else if (y>x){
            return " "+y+" "+x+"";
        }else{
            return "Os dois numeros são iguais";
        }
    }
}