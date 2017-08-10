/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modularizados.function;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class progNassFunc33 {
    public static void main (String[]args){
        Scanner dataN = new Scanner(System.in);
         progNassCalcBI33 pg = new  progNassCalcBI33();
         
        int dia = 0, mes = 0, anoNasc = 0, anoAtual = 0;
        
        System.out.println("Digite o dia que você nasceu: ");
        dia = dataN.nextInt();
        System.out.println("Digite o mês que você nasceu: ");
        mes = dataN.nextInt();
        System.out.println("Digite o ano que você nasceu(yyyy): ");
        anoNasc = dataN.nextInt();
        System.out.println("Digite em que ano nós estamos (yyyy): ");
        anoAtual = dataN.nextInt();
        //=============================================================\\
        
        pg.dia = dia;
        pg.mes = mes;
        pg.anoNasc = anoNasc;
        pg.anoAtual = anoAtual;
        
        
        if ( ( anoNasc % 4 == 0 && anoNasc % 100 != 0 ) || ( anoNasc % 400 == 0 ) ){
            pg.Calcbi();
       }else{
            pg.CalcNbi();
        }
        
    }
}
