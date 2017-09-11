/*
 *  Nome do programador : Ricardo Sousa Vaz de Carvalho
 *  data da elaboracao  : 10/07/2017
 *  Objetivo: Receba a data de nascimento e atual em ano, mês e dia. Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos. 
 */
package Exerc48;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec33 {
    public static void main (String[]args){
        Scanner dataN = new Scanner(System.in);
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
        
        if ( ( anoNasc % 4 == 0 && anoNasc % 100 != 0 ) || ( anoNasc % 400 == 0 ) ){
            
        //DIA ============================================================
        switch (mes){
            case 1:
                if(dia <=31){
                    int auxD = 31; 
                   dia = auxD - dia;
                }else{
                    System.out.print("O dia é invalido");                    System.out.print("O dia é invalido");

                    break;
                }
        case 2:
                if(dia <=29){
                    int auxD = 29;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 3:
                if(dia <=31){
                    int auxD = 31;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 4:
                if(dia <=30){
                    int auxD = 30;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 5:
                if(dia <=31){
                    int auxD = 31;
                    dia =  auxD - dia;
                    
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 6:
                if(dia <=30){
                    int auxD = 30;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 7:
                if(dia <=31){
                    int auxD = 31;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 8:
                if(dia <=31){
                    int auxD = 31;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 9:
                if(dia <=30){
                    int auxD = 30;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 10:
                if(dia <=31){
                    int auxD = 31;
                    dia = dia - auxD;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 11:
                if(dia <=30){
                    int auxD = 30;
                    dia = dia - auxD;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 12:
                if(dia <=31){
                    int auxD = 31;
                    dia = dia - auxD;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        }
       
        if(mes<=12){
            int auxM = 12;
            mes = auxM - mes;
  
        }else{
            System.out.println("Mes invalido");
        }
        
        if (anoAtual<=anoNasc){
            anoNasc = anoAtual-anoNasc;
        
        }else{
            System.out.println("Ano invalido");
        }
        System.out.println("Você tem :"+anoNasc+" anos, "+mes+" meses, "+dia);
        //NÃO É BI===================================================================+++++++++++++++++++++++++++++++++++++++++++++==============================
        }else{
        switch (mes){
            case 1:
                if(dia <=31){
                    int auxD = 31; 
                   dia = auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 2:
                if(dia <=28){
                    int auxD = 28;
                    dia = auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 3:
                if(dia <=31){
                    int auxD = 31;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 4:
                if(dia <=30){
                    int auxD = 30;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 5:
                if(dia <=31){
                    int auxD = 31;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 6:
                if(dia <=30){
                    int auxD = 30;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 7:
                if(dia <=31){
                    int auxD = 31;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 8:
                if(dia <=31){
                    int auxD = 31;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 9:
                if(dia <=30){
                    int auxD = 30;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 10:
                if(dia <=31){
                    int auxD = 31;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 11:
                if(dia <=30){
                    int auxD = 30;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 12:
                if(dia <=31){
                    int auxD = 31;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        }
        
        if(mes<=12){
            int auxM = 12;
            mes = auxM - mes;
        }else{
            System.out.println("Mes invalido");
        }
        if (anoAtual>=anoNasc){
            anoNasc = anoAtual-anoNasc;
        }else{
            System.out.println("Dia invalido");
        }
        System.out.println("Você tem :"+anoNasc+" anos, "+mes+" meses, "+dia);
        }
        
    }
    }

