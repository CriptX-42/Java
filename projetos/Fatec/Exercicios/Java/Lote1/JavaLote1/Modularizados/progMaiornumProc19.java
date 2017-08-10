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
public class progMaiornumProc19 {
    public static void main(String[]args){
        int x = 0, y = 0;
        MaiNum mn = new MaiNum();
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        x = num.nextInt();
        System.out.println("Digite o segundo numero");
        y = num.nextInt();
        
        mn.x = x;
        mn.y = y;
        System.out.println(mn.Maior());
        
    }
}
class MaiNum{
    public int x = 0, y = 0;
    public String Maior(){
        if(x>y){
          return "O numero "+x+" é maior que o numero "+y+"";
        }else if (y>x){
           return "O numero "+y+" é maior que o numero "+x+"";
        }else{
            return "Os dois numeros são iguais";
        }
    }
}
