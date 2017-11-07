/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade;

import java.util.Scanner;


public class Rc01Exempl01 {
    public static void main (String[]args){
        int n1;
        Scanner ler = new Scanner(System.in);
        System.out.println("digite o numero:");
        n1 = ler.nextInt();
        System.out.println("Recursividade " + frecursivo(n1) );
        
        
    }

    //RECURSIVO
    //RECURSIVO
    //RECURSIVO
    public static int frecursivo(int n1){
        int x;
        if(n1==1){
            return n1;
        }else{
        x = n1 * frecursivo(n1-1);
        return x;
    }
        
    }
    
}
