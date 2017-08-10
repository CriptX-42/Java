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
public class progSegundGProc20 {
    public static void main(String []args){
        double aX = 0,bX = 0, cX =0;
        
        Equac eq = new Equac();
        Scanner equac = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        aX = equac.nextInt();
        System.out.println("Digite o valor de B: ");
        bX = equac.nextInt();
        System.out.println("Digite o valor de C: ");
        cX = equac.nextInt();
        
        eq.aX= aX;
        eq.bX = bX;
        eq.cX = cX;
        
        System.out.println(eq.equacD());
        
}
}
class Equac{
    public double aX = 0,bX = 0, cX =0, delta = 0, x1 = 0, x2 = 0;
    public String equacD(){
        delta = (int) (Math.pow(bX,2)-(4*aX*cX));
        if(delta > 0){
        x1 =  ((-(bX)-Math.sqrt(delta))/(2*aX));
        x2 = ((-(bX)+Math.sqrt(delta))/(2*aX));
        return "O valor de x1 é: " + x1 + "O valor de x2 é: " + x2+"";
    }else{
         return "O delta é menor que zero: "+delta+" Portanto é indefinido";
        }
    }
}