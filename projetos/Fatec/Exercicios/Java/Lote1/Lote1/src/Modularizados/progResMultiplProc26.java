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
public class progResMultiplProc26 {
    public static void main(String[]args){
        int x = 0,y = 0;
        ResMult rm = new ResMult();
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        x = num.nextInt();
        System.out.println("Digite o segundo numero: ");
        y = num.nextInt();
        
        rm.x = x;
        rm.y = y;
        System.out.println(rm.ResMulti());
    }
}
class ResMult{
    public int x = 0,y = 0,resto = 0;
    public String ResMulti(){
        if (x<y){
        resto=(y%x);
        if(resto == 0){
            
            return "é divisível ";
        }else{
           return " não é divisível "; 
        }
        }
        if (x>y){
        resto=(x%y);
            if(resto == 0){
            
            return "é divisível ";
        }else{
           return " não é divisível "; 
        }
        }
            return null;
    }
}